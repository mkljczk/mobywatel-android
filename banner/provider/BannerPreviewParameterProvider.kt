package pl.gov.coi.common.ui.ds.banner.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.banner.BannerData
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class BannerPreviewParameterProvider : CustomPreviewParameterProvider&lt;BannerData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;BannerData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;BannerInfoWithoutTitle&quot;,
      value = provideBannerInfoWithoutTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerInfo&quot;,
      value = provideBannerInfo(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerInfoFull&quot;,
      value = provideBannerInfoFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerInfoErrorWithoutTitle&quot;,
      value = provideBannerErrorWithoutTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerError&quot;,
      value = provideBannerError(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerErrorFull&quot;,
      value = provideBannerErrorFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisInfoWithoutTitle&quot;,
      value = provideBannerHighEmphasisInfoWithoutTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisInfo&quot;,
      value = provideBannerHighEmphasisInfo(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisInfoFull&quot;,
      value = provideBannerHighEmphasisInfoFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisErrorWithoutTitle&quot;,
      value = provideBannerHighEmphasisErrorWithoutTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisError&quot;,
      value = provideBannerHighEmphasisError(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;BannerHighEmphasisErrorFull&quot;,
      value = provideBannerHighEmphasisErrorFull(),
    ),
  )

  private fun provideBannerInfoWithoutTitle() = BannerData.Info(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerInfo() = BannerData.Info(
    title = &quot;Info banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerInfoFull() = BannerData.Info(
    title = &quot;Info banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
    buttonData = ButtonTextData(
      label = &quot;Text button&quot;.toLabel(),
    ) {},
    onCloseButtonClick = {},
  )

  private fun provideBannerErrorWithoutTitle() = BannerData.Error(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerError() = BannerData.Error(
    title = &quot;Error banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerErrorFull() = BannerData.Error(
    title = &quot;Error banner with very very very very long title&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
    buttonData = ButtonTextData(
      label = &quot;Text Button&quot;.toLabel(),
    ) {},
    onCloseButtonClick = {},
  )

  private fun provideBannerHighEmphasisInfoWithoutTitle() = BannerData.HighEmphasisInfo(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerHighEmphasisInfo() = BannerData.HighEmphasisInfo(
    title = &quot;High emphasis info banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerHighEmphasisInfoFull() = BannerData.HighEmphasisInfo(
    title = &quot;High emphasis info banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
    buttonData = ButtonData(
      buttonSize = ButtonSize.Small,
      buttonVariant = ButtonVariant.Secondary(
        reversedColor = true,
      ),
      buttonType = ButtonType.WithText(
        label = &quot;Small Button&quot;.toLabel(),
      ),
      onClick = {},
    ),
    onCloseButtonClick = {},
  )

  private fun provideBannerHighEmphasisErrorWithoutTitle() = BannerData.HighEmphasisError(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerHighEmphasisError() = BannerData.HighEmphasisError(
    title = &quot;High emphasis error banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
  )

  private fun provideBannerHighEmphasisErrorFull() = BannerData.HighEmphasisError(
    title = &quot;High emphasis error banner&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.&quot;
      ).toLabel(),
    iconContentDescription = Label.EMPTY,
    buttonData = ButtonData(
      buttonSize = ButtonSize.Small,
      buttonVariant = ButtonVariant.Secondary(
        reversedColor = true,
      ),
      buttonType = ButtonType.WithText(
        label = &quot;Small Button&quot;.toLabel(),
      ),
      onClick = {},
    ),
    onCloseButtonClick = {},
  )
}
