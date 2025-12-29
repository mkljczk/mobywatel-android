package pl.gov.coi.common.ui.ds.singlecard

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pl.gov.coi.common.ui.ds.singlecard.provider.SingleCardPreviewParameterProvider

val SINGLE_CARD_MINIMUM_HEIGHT: Dp = 80.dp

@Deprecated(
  message = &quot;Deprecated&quot;,
  replaceWith = ReplaceWith(
    expression = &quot;SingleCard()&quot;,
    imports = arrayOf(&quot;pl.gov.coi.common.ui.unmapped.singlecard&quot;),
  ),
)
@Composable
fun SingleCard(
  data: SingleCardData,
) {
  when (data) {
    is SingleCardData.Info -&gt; SingleCardInfo(data = data)
    is SingleCardData.Clickable -&gt; SingleCardClickable(data = data)
    is SingleCardData.SelectableRadioButton -&gt; SingleCardSelectableRadioButton(data = data)
    is SingleCardData.SelectableCheckbox -&gt; SingleCardSelectableCheckbox(data = data)
  }
}

@Preview
@Composable
fun SingleCardPreview(
  @PreviewParameter(SingleCardPreviewParameterProvider::class) singleCardData: SingleCardData,
) {
  SingleCard(
    data = singleCardData,
  )
}
