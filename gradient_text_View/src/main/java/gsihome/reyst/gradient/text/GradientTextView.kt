package gsihome.reyst.gradient.text

import android.content.Context
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.provider.CalendarContract
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat


class GradientTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {


    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)

        //Setting the gradient if layout is changed
        if (changed) {
            val intArray = IntArray(4)
            intArray[0] = Color.BLUE
            intArray[1] = Color.GREEN
            intArray[2] = Color.YELLOW
            intArray[3] = Color.RED

            paint.shader = LinearGradient(0F, 0F, width.toFloat(), height.toFloat(),
                                          intArray, null,
//                                               ContextCompat.getColor(context, R.color.colorStart),
//                                               ContextCompat.getColor(context, R.color.colorEnd),
                                          Shader.TileMode.CLAMP)
        }
    }

}