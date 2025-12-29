package pl.gov.coi.common.ui.ds.alert.provider

import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.alert.AlertButtonData
import pl.gov.coi.common.ui.ds.alert.AlertData
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonTextData
import pl.gov.coi.common.ui.ds.link.LinkData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class AlertPreviewParameterProvider : CustomPreviewParameterProvider&lt;AlertData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;AlertData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoDescr&quot;,
      value = provideAlertInfoOnlyDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoTitleDescr&quot;,
      value = provideAlertInfoTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoDescrTextBtn&quot;,
      value = provideAlertInfoDescriptionTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoDescrLink&quot;,
      value = provideAlertInfoDescriptionLink(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoTitleDescrTextBtn&quot;,
      value = provideAlertInfoTitleDescrTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoDescrTextBtnCloseBtn&quot;,
      value = provideAlertInfoDescrTextBtnCloseBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertInfoFull&quot;,
      value = provideAlertInfoFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorDescr&quot;,
      value = provideAlertErrorOnlyDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorTitleDescr&quot;,
      value = provideAlertErrorTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorDescrTextBtn&quot;,
      value = provideAlertErrorDescriptionTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorDescrLink&quot;,
      value = provideAlertErrorDescriptionLink(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorTitleDescrTextBtn&quot;,
      value = provideAlertErrorTitleDescrTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorDescrTextBtnCloseBtn&quot;,
      value = provideAlertErrorDescrTextBtnCloseBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertErrorFull&quot;,
      value = provideAlertErrorFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningDescr&quot;,
      value = provideAlertWarningOnlyDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningTitleDescr&quot;,
      value = provideAlertWarningTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningDescrTextBtn&quot;,
      value = provideAlertWarningDescriptionTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningDescrLink&quot;,
      value = provideAlertWarningDescriptionLink(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningTitleDescrTextBtn&quot;,
      value = provideAlertWarningTitleDescrTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningDescrTextBtnCloseBtn&quot;,
      value = provideAlertWarningDescrTextBtnCloseBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertWarningFull&quot;,
      value = provideAlertWarningFull(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessDescr&quot;,
      value = provideAlertSuccessOnlyDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessTitleDescr&quot;,
      value = provideAlertSuccessTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessDescrTextBtn&quot;,
      value = provideAlertSuccessDescriptionTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessDescrLink&quot;,
      value = provideAlertSuccessDescriptionLink(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessTitleDescrTextBtn&quot;,
      value = provideAlertSuccessTitleDescrTextBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessDescrTextBtnCloseBtn&quot;,
      value = provideAlertSuccessDescrTextBtnCloseBtn(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AlertSuccessFull&quot;,
      value = provideAlertSuccessFull(),
    ),
  )

  private fun provideAlertInfoOnlyDescription() = AlertData.Info(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertInfoTitleDescription() = AlertData.Info(
    title = &quot;Info alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertInfoDescriptionTextBtn() = AlertData.Info(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
      ) {},
    ),
  )

  private fun provideAlertInfoDescriptionLink() = AlertData.Info(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.Link(
      data = LinkData(
        label = &quot;Link&quot;.toLabel(),
        url = &quot;&quot;,
        linkType = LinkData.LinkType.WEBSITE,
        onClick = {},
      ),
    ),
  )

  private fun provideAlertInfoTitleDescrTextBtn() = AlertData.Info(
    title = &quot;Info alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
      ) {},
    ),
  )

  private fun provideAlertInfoDescrTextBtnCloseBtn() = AlertData.Info(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertInfoFull() = AlertData.Info(
    title = &quot;Info alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertErrorOnlyDescription() = AlertData.Error(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertErrorTitleDescription() = AlertData.Error(
    title = &quot;Error alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertErrorDescriptionTextBtn() = AlertData.Error(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertErrorDescriptionLink() = AlertData.Error(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.Link(
      data = LinkData(
        label = &quot;Link&quot;.toLabel(),
        url = &quot;&quot;,
        linkType = LinkData.LinkType.WEBSITE,
        onClick = {},
      ),
    ),
  )

  private fun provideAlertErrorTitleDescrTextBtn() = AlertData.Error(
    title = &quot;Error alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertErrorDescrTextBtnCloseBtn() = AlertData.Error(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertErrorFull() = AlertData.Error(
    title = &quot;Error alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertWarningOnlyDescription() = AlertData.Warning(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertWarningTitleDescription() = AlertData.Warning(
    title = &quot;Warning alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertWarningDescriptionTextBtn() = AlertData.Warning(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertWarningDescriptionLink() = AlertData.Warning(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.Link(
      data = LinkData(
        label = &quot;Link&quot;.toLabel(),
        url = &quot;&quot;,
        linkType = LinkData.LinkType.WEBSITE,
        onClick = {},
      ),
    ),
  )

  private fun provideAlertWarningTitleDescrTextBtn() = AlertData.Warning(
    title = &quot;Warning alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertWarningDescrTextBtnCloseBtn() = AlertData.Warning(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertWarningFull() = AlertData.Warning(
    title = &quot;Warning alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertSuccessOnlyDescription() = AlertData.Success(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertSuccessTitleDescription() = AlertData.Success(
    title = &quot;Success alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
  )

  private fun provideAlertSuccessDescriptionTextBtn() = AlertData.Success(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertSuccessDescriptionLink() = AlertData.Success(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.Link(
      data = LinkData(
        label = &quot;Link&quot;.toLabel(),
        url = &quot;&quot;,
        linkType = LinkData.LinkType.WEBSITE,
        onClick = {},
      ),
    ),
  )

  private fun provideAlertSuccessTitleDescrTextBtn() = AlertData.Success(
    title = &quot;Success alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertSuccessDescrTextBtnCloseBtn() = AlertData.Success(
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )

  private fun provideAlertSuccessFull() = AlertData.Success(
    title = &quot;Success alert&quot;.toLabel(),
    bodyText = (
      &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor &quot; +
        &quot;incididunt ut labore.&quot;
      ).toLabel(),
    alertContentDescription = Label.EMPTY,
    onCloseButtonClick = {},
    alertButtonData = AlertButtonData.ButtonText(
      data = ButtonTextData(
        label = &quot;Text button&quot;.toLabel(),
        onClick = {},
      ),
    ),
  )
}
