package pl.gov.coi.common.ui.ds.radiobutton.common.model

import androidx.compose.runtime.Composable
import pl.gov.coi.common.domain.label.Label

interface RadioButtonCustomContent {
  fun content(): @Composable () -&gt; Unit
}

data class RadioButtonRow(
  val item: RadioButtonItemData,
  val onClick: () -&gt; Unit,
  val label: Label,
  val description: Label? = null,
  val content: RadioButtonCustomContent? = null,
)
