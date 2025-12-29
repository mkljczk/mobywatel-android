package pl.gov.coi.common.ui.ds.singlecard.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.ds.singlecard.SingleCardStatusBadgeData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

/* 
 TODO REMOVE MOB-49304 
 */
class SingleCardStatusBadgePreviewProvider : CustomPreviewParameterProvider&lt;SingleCardStatusBadgeData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SingleCardStatusBadgeData&gt;&gt;
    get() = sequenceOf(
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDefaultGreen&quot;,
        value = SingleCardStatusBadgeData.Default.Green(
          text = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDefaultYellow&quot;,
        value = SingleCardStatusBadgeData.Default.Yellow(
          text = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDefaultRed&quot;,
        value = SingleCardStatusBadgeData.Default.Red(
          text = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataDefaultBlue&quot;,
        value = SingleCardStatusBadgeData.Default.Blue(
          text = &quot;Roboto, Medium, 16, Neutral-500&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithNoIconNormal&quot;,
        value = SingleCardStatusBadgeData.WithNoIcon.Normal(
          text = &quot;Roboto, Regular, 14, Neutral-200&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithNoIconError&quot;,
        value = SingleCardStatusBadgeData.WithNoIcon.Error(
          text = &quot;Roboto, Medium, 14, Red-100&quot;.toLabel(),
        ),
      ),

      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconSuccess&quot;,
        value = SingleCardStatusBadgeData.WithIcon.Success(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconError&quot;,
        value = SingleCardStatusBadgeData.WithIcon.Error(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconWarning&quot;,
        value = SingleCardStatusBadgeData.WithIcon.Warning(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconInfo&quot;,
        value = SingleCardStatusBadgeData.WithIcon.Info(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconAndBorderActive&quot;,
        value = SingleCardStatusBadgeData.WithIconAndBorder.Active(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconAndBorderActive&quot;,
        value = SingleCardStatusBadgeData.WithIconAndBorder.ActionNeeded(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconAndBorderFailure&quot;,
        value = SingleCardStatusBadgeData.WithIconAndBorder.Failure(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithIconAndBorderCanceled&quot;,
        value = SingleCardStatusBadgeData.WithIconAndBorder.Canceled(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          iconContentDescription = Label.EMPTY,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderGreen&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Green(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDatWithDotAndBorderYellow&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Yellow(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderRed&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Red(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderBlue&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Blue(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = false,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderGreenColored&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Green(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = true,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderYellowColored&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Yellow(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = true,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDatWithDotAndBorderRedColored&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Red(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = true,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataWithDotAndBorderBlueColored&quot;,
        value = SingleCardStatusBadgeData.WithDotAndBorder.Blue(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
          isColored = true,
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataElevatedGreen&quot;,
        value = SingleCardStatusBadgeData.Elevated.Green(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataElevatedYellow&quot;,
        value = SingleCardStatusBadgeData.Elevated.Yellow(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataElevatedRed&quot;,
        value = SingleCardStatusBadgeData.Elevated.Red(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
        ),
      ),
      ScreenShotTestData(
        screenShotTestName = &quot; StatusBadgeDataElevatedBlue&quot;,
        value = SingleCardStatusBadgeData.Elevated.Blue(
          text = &quot;Roboto, Regular, 12, Neutral-200&quot;.toLabel(),
        ),
      ),
    )
}
