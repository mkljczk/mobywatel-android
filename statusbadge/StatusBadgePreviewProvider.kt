package pl.gov.coi.common.ui.ds.statusbadge

import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class StatusBadgePreviewProvider : CustomPreviewParameterProvider&lt;StatusBadgeData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;StatusBadgeData&gt;&gt;
    get() = sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDotPositive&quot;,
        value = StatusBadgeData.WithDot(
          label = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithDotStatus.POSITIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDotInformative&quot;,
        value = StatusBadgeData.WithDot(
          label = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithDotStatus.INFORMATIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDotNegative&quot;,
        value = StatusBadgeData.WithDot(
          label = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithDotStatus.NEGATIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDotWarning&quot;,
        value = StatusBadgeData.WithDot(
          label = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithDotStatus.WARNING,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataPositive&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 12, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.POSITIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataNegative&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 12, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.NEGATIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataNotice&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 12, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.NOTICE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataInformative&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 12, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.INFORMATIVE,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataNeutral&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 12, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.MINUS,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithoutBorderPositive&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.POSITIVE,
          withBorder = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithoutBorderNegative&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.NEGATIVE,
          withBorder = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithoutBorderNotice&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.NOTICE,
          withBorder = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithoutBorderInformative&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.INFORMATIVE,
          withBorder = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithoutBorderNeutral&quot;,
        value = StatusBadgeData.WithIcon(
          label = &quot;Roboto, Regular, 16, Neutral-500&quot;.toLabel(),
          status = StatusBadgeWithIconStatus.MINUS,
          withBorder = false,
        ),
      ),
    )
}
