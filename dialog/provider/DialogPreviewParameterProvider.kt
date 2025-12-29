package pl.gov.coi.common.ui.ds.dialog.provider

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.ButtonData
import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonState
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.ds.dialog.DialogData
import pl.gov.coi.common.ui.ds.dialog.DialogIconData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.theme.AppTheme
import pl.gov.coi.common.ui.theme.withStyle

class DialogPreviewParameterProvider() : CustomPreviewParameterProvider&lt;DialogData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;DialogData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;DialogLongTextOneButton&quot;,
      value = provideDialogLongTextOneButton(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogLongTextTwoButtons&quot;,
      value = provideDialogLongTextTwoButtons(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogLongTextThreeButtons&quot;,
      value = provideDialogLongTextThreeButtons(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogOnlyTitleOneButton&quot;,
      value = provideDialogOnlyTitleOneButton(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogShortTextColoredButton&quot;,
      value = provideDialogShortTextColoredButton(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogShortTextWithIcon&quot;,
      value = provideDialogShortTextWithIcon(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;DialogHighlightedTextTwoButtons&quot;,
      value = provideDialogHighlightedTextTwoButtons(),
    ),
  )

  private fun provideLongText() =
    &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. &quot; +
      &quot;Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar tempor. &quot; +
      &quot;Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.&quot;

  private fun provideDialogLongTextOneButton() =
    DialogData.WithText(
      title = &quot;Dialog Title&quot;.toLabel(),
      body = provideLongText().toLabel(),
      primaryButtonData =
      ButtonData(
        buttonVariant = ButtonVariant.Tertiary,
        buttonType = ButtonType.WithText(
          label = &quot;Primary button&quot;.toLabel(),
        ),
        buttonSize = ButtonSize.Small,
        onClick = {},
      ),
    ) {}

  private fun provideDialogLongTextTwoButtons() = provideDialogLongTextOneButton().copy(
    secondaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Secondary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
  )

  private fun provideDialogLongTextThreeButtons() = DialogData.WithThreeButtons(
    title = &quot;Dialog Title&quot;.toLabel(),
    body = provideLongText().toLabel(),
    primaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Primary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
    secondaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Secondary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
    tertiaryButtonData =
    ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Tertiary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
  ) {}

  private fun provideDialogOnlyTitleOneButton() = DialogData.WithText(
    title = &quot;Dialog Title&quot;.toLabel(),
    primaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Primary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
  ) {}

  private fun provideDialogShortTextColoredButton() = DialogData.WithText(
    title = &quot;Dialog Title&quot;.toLabel(),
    body = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet.&quot;.toLabel(),
    primaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Primary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
    secondaryButtonData = ButtonData(
      buttonState = ButtonState.Destructive,
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Secondary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
  ) {}

  private fun provideDialogShortTextWithIcon() = DialogData.WithIcon(
    icon = DialogIconData(
      iconResId = R.drawable.aa025_star,
      iconColorProvider = { AppTheme.colors.supportRed100 },
    ),
    title = &quot;Dialog Title&quot;.toLabel(),
    body = &quot;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet.&quot;.toLabel(),
    primaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Primary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
    secondaryButtonData = ButtonData(
      buttonVariant = ButtonVariant.Tertiary,
      buttonType = ButtonType.WithText(
        label = &quot;Secondary button&quot;.toLabel(),
      ),
      buttonSize = ButtonSize.Small,
      onClick = {},
    ),
  ) {}

  private fun provideDialogHighlightedTextTwoButtons() = provideDialogLongTextTwoButtons().copy(
    annotatedBody = { getAnnotatedString() },
  )

  @Composable
  private fun getAnnotatedString() =
    buildAnnotatedString {
      val spanStyle = AppTheme.typography.bodyLargeRegular
      withStyle(spanStyle) {
        append(&quot;Normal text&quot;)
      }
      withStyle(
        spanStyle.copy(
          fontWeight = FontWeight.Bold,
          color = AppTheme.colors.primary900,
        ),
      ) {
        append(&quot; Highlighted text&quot;)
      }
      withStyle(spanStyle) {
        append(&quot; Normal text&quot;)
      }
    }

}
