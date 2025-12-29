package pl.gov.coi.common.ui.ds.image

import android.graphics.Bitmap
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.ds.custom.icon.IconSize

data class ImageData(
  val image: Bitmap,
  val onClick: () -&gt; Unit,
  val size: IconSize,
  val shapeProvider: @Composable () -&gt; Shape,
  val contentDescription: Label,
)
