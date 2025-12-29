package pl.gov.coi.common.ui.ds.singlecard.provider

import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.custom.icon.IconSize
import pl.gov.coi.common.ui.ds.singlecard.radiobutton.OldRadioButtonData
import pl.gov.coi.common.ui.ds.singlecard.radiobutton.RadioButtonId
import pl.gov.coi.common.ui.ds.singlecard.SingleCardClickableRadioButtonState
import pl.gov.coi.common.ui.ds.singlecard.SingleCardData
import pl.gov.coi.common.ui.ds.singlecard.SingleCardInfoExtras
import pl.gov.coi.common.ui.ds.singlecard.SingleCardInfoState
import pl.gov.coi.common.ui.ds.singlecard.SingleCardStatusBadgeData
import pl.gov.coi.common.ui.ds.switchcomponent.SwitchData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class SingleCardPreviewParameterProvider : CustomPreviewParameterProvider&lt;SingleCardData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;SingleCardData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitle&quot;,
      value = provideSingleCardInfoTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleLong&quot;,
      value = provideSingleCardInfoTitleLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleDescription&quot;,
      value = provideSingleCardInfoTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleDescriptionLong&quot;,
      value = provideSingleCardInfoTitleDescriptionLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleInfo&quot;,
      value = provideSingleCardInfoTitleInfo(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleInfoLong&quot;,
      value = provideSingleCardInfoTitleInfoLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleIcon&quot;,
      value = provideSingleCardInfoTitleIcon(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleInfoLong&quot;,
      value = provideSingleCardInfoTitleIconBigger(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleDescriptionIcon&quot;,
      value = provideSingleCardInfoTitleDescriptionIcon(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleDescriptionIconDisabledState&quot;,
      value = provideSingleCardInfoTitleDescriptionIconDisabledState(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleWithButton&quot;,
      value = provideSingleCardInfoTitleWithButton(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleWithSwitch&quot;,
      value = provideSingleCardInfoTitleWithSwitch(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoDraggableTitle&quot;,
      value = provideSingleCardInfoDraggableTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoDraggableTitleDescription&quot;,
      value = provideSingleCardInfoDraggableTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitle&quot;,
      value = provideSingleCardClickableTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitleWithoutTrailingIcon&quot;,
      value = provideSingleCardClickableTitleWithoutTrailingIcon(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitleLong&quot;,
      value = provideSingleCardClickableTitleLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitleDescription&quot;,
      value = provideSingleCardClickableTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitleDescriptionLong&quot;,
      value = provideSingleCardClickableTitleDescriptionLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableInfoTitle&quot;,
      value = provideSingleCardClickableInfoTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableInfoTitleLong&quot;,
      value = provideSingleCardClickableInfoTitleLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitle&quot;,
      value = provideSingleCardClickableIconTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleLong&quot;,
      value = provideSingleCardClickableIconTitleLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescription&quot;,
      value = provideSingleCardClickableIconTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescriptionLong&quot;,
      value = provideSingleCardClickableIconTitleDescriptionLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableButtonIconTitle&quot;,
      value = provideSingleCardButtonIconTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableButtonIconTitleDescription&quot;,
      value = provideSingleCardButtonIconTitleDescription(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableDeleteButtonIconTitle&quot;,
      value = provideSingleCardDeleteButtonIconTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescriptionLongEnabledState&quot;,
      value = provideSingleCardClickableIconTitleDescriptionLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescriptionLongFocusState&quot;,
      value = provideSingleCardClickableIconTitleDescriptionLongFocusState(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescriptionLongDisabledState&quot;,
      value = provideSingleCardClickableIconTitleDescriptionLongDisabledState(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableIconTitleDescriptionLongIconOnOneLineWithTitle&quot;,
      value = provideSingleCardClickableIconTitleDescriptionLongIconOnOneLineWithTitle(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardClickableTitleDescriptionStatusBadge&quot;,
      value = provideSingleCardClickableTitleDescriptionStatusBadge(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleUnselected&quot;,
      value = provideSingleCardSelectableRadioButtonTitleUnselected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleUnselectedLong&quot;,
      value = provideSingleCardSelectableRadioButtonTitleUnselectedLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleSelected&quot;,
      value = provideSingleCardSelectableRadioButtonTitleSelected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonIconTitleUnselected&quot;,
      value = provideSingleCardSelectableRadioButtonIconTitleUnselected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonIconTitleUnselectedLong&quot;,
      value = provideSingleCardSelectableRadioButtonIconTitleUnselectedLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonIconTitleSelected&quot;,
      value = provideSingleCardSelectableRadioButtonIconTitleSelected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleDescriptionUnselected&quot;,
      value = provideSingleCardSelectableRadioButtonTitleDescriptionUnselected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleDescriptionUnselectedLong&quot;,
      value = provideSingleCardSelectableRadioButtonTitleDescriptionUnselectedLong(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleDescriptionSelected&quot;,
      value = provideSingleCardSelectableRadioButtonTitleDescriptionSelected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleUnselectedEnabledState&quot;,
      value = provideSingleCardSelectableRadioButtonTitleUnselected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleUnselectedFocusState&quot;,
      value = provideSingleCardSelectableRadioButtonTitleUnselectedFocusState(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonTitleUnselectedDisabledState&quot;,
      value = provideSingleCardSelectableRadioButtonTitleUnselectedDisabledState(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardSelectableRadioButtonBiggerIconTitleSelected&quot;,
      value = provideSingleCardSelectableRadioButtonBiggerIconTitleSelected(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SingleCardInfoTitleDescriptionStatusBadge&quot;,
      value = provideSingleCardInfoTitleDescriptionStatusBadge(),
    ),
  )

  private fun provideSingleCardInfoTitle() = SingleCardData.Info.Title(
    title = &quot;Card title&quot;.toLabel(),
  )

  private fun provideSingleCardInfoTitleLong() = SingleCardData.Info.Title(
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
  )

  private fun provideSingleCardInfoTitleDescription() = SingleCardData.Info.TitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
  )

  private fun provideSingleCardInfoTitleDescriptionLong() = SingleCardData.Info.TitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;
      .toLabel(),
  )

  private fun provideSingleCardInfoTitleInfo() = SingleCardData.Info.InfoTitle(
    title = &quot;Card title&quot;.toLabel(),
    info = &quot;Card info&quot;.toLabel(),
  )

  private fun provideSingleCardInfoTitleInfoLong() = SingleCardData.Info.InfoTitle(
    title = &quot;Card title&quot;.toLabel(),
    info = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
  )

  private fun provideSingleCardInfoTitleIcon() = SingleCardData.Info.IconTitle(
    title = &quot;Card title&quot;.toLabel(),
    iconResId = R.drawable.ab001_home,
  )

  private fun provideSingleCardInfoTitleIconBigger() = SingleCardData.Info.IconTitle(
    title = &quot;Card title&quot;.toLabel(),
    iconResId = R.drawable.ab001_home,
    iconSize = IconSize.SIZE32,
  )

  private fun provideSingleCardInfoTitleDescriptionIcon() = SingleCardData.Info.IconTitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    iconResId = R.drawable.ab001_home,
  )

  private fun provideSingleCardInfoTitleDescriptionIconDisabledState() = SingleCardData.Info.IconTitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    iconResId = R.drawable.ab001_home,
    state = SingleCardInfoState.DISABLE,
  )

  private fun provideSingleCardInfoTitleWithButton() = SingleCardData.Info.Title(
    title = &quot;Card title&quot;.toLabel(),
    extras = SingleCardInfoExtras.ButtonMore(
      buttonData = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonVariant = ButtonVariant.Primary,
        buttonType = ButtonType.WithText(
          label = &quot;Więcej&quot;.toLabel(),
        ),
        onClick = {},
      ),
    ),
  )

  private fun provideSingleCardInfoTitleWithSwitch() = SingleCardData.Info.Title(
    title = &quot;Card title&quot;.toLabel(),
    extras = SingleCardInfoExtras.Switch(
      switchData = SwitchData.SwitchOnly(
        contentDescription = &quot;Card title&quot;.toLabel(),
        checked = false,
        onCheckedChange = {},
      ),
    ),
  )

  private fun provideSingleCardInfoDraggableTitle() = SingleCardData.Info.Title(
    title = &quot;Card title&quot;.toLabel(),
    draggable = true,
  )

  private fun provideSingleCardInfoDraggableTitleDescription() = SingleCardData.Info.TitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    draggable = true,
  )

  private fun provideSingleCardClickableTitle() = SingleCardData.Clickable.Title(
    title = &quot;Card title&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableTitleWithoutTrailingIcon() = SingleCardData.Clickable.Title(
    title = &quot;Card title&quot;.toLabel(),
    onClick = {},
    trailingIonResId = null,
  )

  private fun provideSingleCardClickableTitleLong() = SingleCardData.Clickable.Title(
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableTitleDescription() = SingleCardData.Clickable.TitleDescription(
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableTitleDescriptionLong() = SingleCardData.Clickable.TitleDescription(
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableInfoTitle() = SingleCardData.Clickable.InfoTitle(
    title = &quot;Card title&quot;.toLabel(),
    info = &quot;Card info&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableInfoTitleLong() = SingleCardData.Clickable.InfoTitle(
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    info = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableIconTitle() = SingleCardData.Clickable.IconTitle(
    iconResId = R.drawable.ab001_home,
    title = &quot;Card title&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableIconTitleLong() = SingleCardData.Clickable.IconTitle(
    iconResId = R.drawable.ab001_home,
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableIconTitleDescription() = SingleCardData.Clickable.IconTitleDescription(
    iconResId = R.drawable.ab001_home,
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableIconTitleDescriptionLong() = SingleCardData.Clickable.IconTitleDescription(
    iconResId = R.drawable.ab001_home,
    title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
    description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardClickableIconTitleDescriptionLongIconOnOneLineWithTitle() =
    SingleCardData.Clickable.IconTitleDescription(
      iconResId = R.drawable.ab001_home,
      iconOnOneLineWithTitle = true,
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
      onClick = {},
    )

  private fun provideSingleCardClickableIconTitleDescriptionLongFocusState() =
    SingleCardData.Clickable.IconTitleDescription(
      iconResId = R.drawable.ab001_home,
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
      state = SingleCardClickableRadioButtonState.FOCUS,
      onClick = {},
    )

  private fun provideSingleCardClickableIconTitleDescriptionLongDisabledState() =
    SingleCardData.Clickable.IconTitleDescription(
      iconResId = R.drawable.ab001_home,
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
      state = SingleCardClickableRadioButtonState.DISABLED,
      onClick = {},
    )

  private fun provideSingleCardClickableTitleDescriptionStatusBadge() =
    SingleCardData.Clickable.TitleDescriptionStatusBadge(
      title = &quot;Card title with status badge&quot;.toLabel(),
      description = &quot;Card description&quot;.toLabel(),
      badgeData = SingleCardStatusBadgeData.WithIcon.Info(
        text = &quot;Badge status info&quot;.toLabel(),
        iconContentDescription = &quot;content desc&quot;.toLabel(),
      ),
      onClick = {},
    )

  private fun provideSingleCardButtonIconTitle() = SingleCardData.Clickable.ButtonIconTitle(
    iconResId = R.drawable.ab001_home,
    title = &quot;Card title&quot;.toLabel(),
    onIconClick = {},
  )

  private fun provideSingleCardButtonIconTitleDescription() = SingleCardData.Clickable.ButtonIconTitleDescription(
    iconResId = R.drawable.ab001_home,
    title = &quot;Card title&quot;.toLabel(),
    description = &quot;Card description&quot;.toLabel(),
    onIconClick = {},
  )

  private fun provideSingleCardDeleteButtonIconTitle() = SingleCardData.Clickable.DeleteButtonIconTitle(
    title = &quot;Card title&quot;.toLabel(),
    onClick = {},
  )

  private fun provideSingleCardSelectableRadioButtonTitleUnselected() = SingleCardData.SelectableRadioButton.Title(
    title = &quot;Card title&quot;.toLabel(),
    radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
    onClick = {},
  )

  private fun provideSingleCardSelectableRadioButtonTitleUnselectedFocusState() =
    SingleCardData.SelectableRadioButton.Title(
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      state = SingleCardClickableRadioButtonState.FOCUS,
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleUnselectedDisabledState() =
    SingleCardData.SelectableRadioButton.Title(
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      state = SingleCardClickableRadioButtonState.DISABLED,
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleUnselectedLong() =
    SingleCardData.SelectableRadioButton.Title(
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleSelected() =
    SingleCardData.SelectableRadioButton.Title(
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonIconTitleUnselected() =
    SingleCardData.SelectableRadioButton.IconTitle(
      iconResId = R.drawable.ab001_home,
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonIconTitleUnselectedLong() =
    SingleCardData.SelectableRadioButton.IconTitle(
      iconResId = R.drawable.ab001_home,
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonIconTitleSelected() =
    SingleCardData.SelectableRadioButton.IconTitle(
      iconResId = R.drawable.ab001_home,
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonBiggerIconTitleSelected() =
    SingleCardData.SelectableRadioButton.IconTitle(
      iconResId = R.drawable.ab001_home,
      iconSize = IconSize.SIZE32,
      title = &quot;Card title&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleDescriptionUnselected() =
    SingleCardData.SelectableRadioButton.TitleDescription(
      title = &quot;Card title&quot;.toLabel(),
      description = &quot;Card description no 1&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleDescriptionUnselectedLong() =
    SingleCardData.SelectableRadioButton.TitleDescription(
      title = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt&quot;.toLabel(),
      description = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = false),
      onClick = {},
    )

  private fun provideSingleCardSelectableRadioButtonTitleDescriptionSelected() =
    SingleCardData.SelectableRadioButton.TitleDescription(
      title = &quot;Card title&quot;.toLabel(),
      description = &quot;Card description no 1&quot;.toLabel(),
      descriptionSecond = &quot;Card description no 2&quot;.toLabel(),
      radioButtonData = OldRadioButtonData(id = RadioButtonId.Default, isSelected = true),
      onClick = {},
    )

  private fun provideSingleCardInfoTitleDescriptionStatusBadge() =
    SingleCardData.Info.TitleStatusBadge(
      title = &quot;Status&quot;.toLabel(),
      state = SingleCardInfoState.ENABLED,
      badgeData = SingleCardStatusBadgeData.Default.Green(
        text = &quot;Opłacona&quot;.toLabel(),
      ),
    )
}
