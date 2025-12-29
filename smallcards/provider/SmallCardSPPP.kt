package pl.gov.coi.common.ui.ds.smallcards.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.smallcards.SmallCardSData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class SmallCardSPPP : CustomPreviewParameterProvider&lt;SmallCardSData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SmallCardSData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SmallCard Confirm identity&quot;,
      value = SmallCardSData(
        title = &quot;Potwierdź dane&quot;.toLabel(),
        iconResId = R.drawable.ai002_confirm_identity,
        iconColorProvider = { AppTheme.colors.primary900 },
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallCard Delete&quot;,
      value = SmallCardSData(
        title = &quot;Usuń&quot;.toLabel(),
        iconResId = R.drawable.aa002_delete,
        iconColorProvider = { AppTheme.colors.supportRed100 },
        onClick = {},
      ),
    ),
  )
}
