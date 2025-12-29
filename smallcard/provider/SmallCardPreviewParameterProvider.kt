package pl.gov.coi.common.ui.ds.smallcard.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.smallcard.SmallCardData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class SmallCardPreviewParameterProvider : CustomPreviewParameterProvider&lt;SmallCardData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SmallCardData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SmallCard&quot;,
      value = SmallCardData(
        title = &quot;Naruszenie środowiskowe&quot;.toLabel(),
        iconResId = R.drawable.da002_naruszenie_srodowiskowe,
        iconColorProvider = { AppTheme.colors.serviceLeafy100 },
        onClick = {},
      ),
    ),
  )
}
