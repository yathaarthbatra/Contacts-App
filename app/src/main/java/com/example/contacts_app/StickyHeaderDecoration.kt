package com.example.contacts_app

import android.content.Context
import android.content.res.Resources
import android.graphics.Canvas
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_app.databinding.HeaderItemBinding

class StickyHeaderDecoration(private val adapter: ContactsAdapter1, root: View) :
    RecyclerView.ItemDecoration() {
    //root contains the Activity_Main View

    private val headerBinding by lazy { HeaderItemBinding.inflate(LayoutInflater.from(root.context)) }
    //headerBinding contains the whole View reference
    private val headerView: View
        get() = headerBinding.root

    //header View contains the view of the single header item

    override fun onDrawOver(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(canvas, parent, state)
        val topChild = parent.getChildAt(0)
        //top child is the top most view of the recycler view visible on the screen
        val secondChild = parent.getChildAt(1)
        //secondChild is the secondmost top View of the recycler visible

        parent.getChildAdapterPosition(topChild) //it gives the position ie number of the top child view
            .let { topChildPosition ->
                val header:String = adapter.getHeaderForCurrentPosition(topChildPosition)
                headerBinding.headerText.text = header

                layoutHeaderView(topChild)

                canvas.drawHeaderView(topChild, secondChild)
            }
    }

    private fun layoutHeaderView(topView: View?) {
        // headerView is the view of the single header item
        topView?.let {
            headerView.measure(
                View.MeasureSpec.makeMeasureSpec(topView.width, View.MeasureSpec.EXACTLY),
                View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
            )
            headerView.layout(topView.left, 0, topView.right, headerView.measuredHeight)
        }
    }

    private fun Canvas.drawHeaderView(topView: View?, secondChild: View?) {
        save()
        translate(0f, calculateHeaderTop(topView, secondChild))
        headerView.draw(this)
        restore()
    }

    private fun calculateHeaderTop(topView: View?, secondChild: View?): Float =
        secondChild?.let { secondView ->
            val threshold = getPixels(8, headerBinding.root.context) + headerView.bottom
            if (secondView.findViewById<View>(headerView.id)?.visibility != View.GONE && secondView.top <= threshold) {
                (secondView.top - threshold).toFloat()
            } else {
                maxOf(topView?.top ?: 0, 0).toFloat()
            }
        } ?: maxOf(topView?.top ?: 0, 0).toFloat()

    private fun getPixels(dipValue: Int, context: Context): Int {
        val r: Resources = context.resources
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dipValue.toFloat(),
            r.displayMetrics
        ).toInt()
    }
}



