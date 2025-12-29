package pl.gov.coi.common.ui.ds.inforow.provider

import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowData
import pl.gov.coi.common.ui.ds.inforow.model.InfoRowListData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme

class InfoRowPPP : CustomPreviewParameterProvider&lt;InfoRowListData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;InfoRowListData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;InfoRowBullet&quot;,
      value = InfoRowListData(
        listOf(
          InfoRowData.Bullet(
            description = (&quot;Bullet info row description Bullet info row description &quot; +
              &quot;Bullet info row description Bullet info row description Bullet info row description &quot; +
              &quot;Bullet info row description Bullet info row description &quot;).toLabel(),
          ),
          InfoRowData.Bullet(
            description = &quot;Bullet info row description&quot;.toLabel(),
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;InfoRowDefault&quot;,
      value = InfoRowListData(
        listOf(
          InfoRowData.Default(
            title = &quot;Title label 1&quot;.toLabel(),
            description = (&quot;Description label 1 Description label 1 Description label 1 &quot; +
              &quot;Description label 1 Description label 1&quot;).toLabel(),
            iconResId = R.drawable.aa037_rounded_plus,
            iconColorProvider = { AppTheme.colors.supportGreen100 },
          ),
          InfoRowData.Default(
            title = &quot;Title label 2&quot;.toLabel(),
            description = &quot;Description label 2&quot;.toLabel(),
            iconResId = R.drawable.aa002_delete,
            iconColorProvider = { AppTheme.colors.supportRed100 },
          ),
        ),
      ),
    ),
  )
}
