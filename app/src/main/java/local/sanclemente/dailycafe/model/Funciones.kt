package local.sanclemente.dailycafe.model

import android.graphics.BitmapFactory
import android.widget.EditText
import android.widget.ImageView
import local.sanclemente.dailycafe.R

fun ImageView.setImageFromBytes(imageBytes: ByteArray?) {
    if (imageBytes != null) {
        val bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
        this.setImageBitmap(bitmap)
    } else {
        // Manejar el caso donde no hay imagen
        this.setImageResource(R.drawable.coffee)
    }
}

fun EditText.getInt(): Int {
    return text.toString().toIntOrNull() ?: 0
}