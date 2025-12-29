package pl.gov.coi.common.ui.ds.button

import pl.gov.coi.common.ui.ds.button.common.ButtonSize
import pl.gov.coi.common.ui.ds.button.common.ButtonState
import pl.gov.coi.common.ui.ds.button.common.ButtonType
import pl.gov.coi.common.ui.ds.button.common.ButtonVariant
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class ButtonPPP : CustomPreviewParameterProvider&lt;ButtonData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ButtonData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;SmallTextPrimaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallTextPrimaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallTextPrimaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallTextPrimaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallPrimaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallPrimaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallSecondaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallSecondaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallSecondaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallSecondaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallSecondaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallSecondaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallTertiaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallTertiaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallTertiaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallTertiaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;SmallTertiaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Small,
        buttonType = ButtonType.WithText(
          label = &quot;SmallTertiaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargePrimaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargePrimaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargePrimaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargePrimaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargePrimaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargePrimaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Primary,
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeSecondaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeSecondaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeSecondaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeSecondaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeSecondaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeSecondaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Secondary(),
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeTertiaryEnabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeTertiaryEnabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeTertiaryDestructive&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeTertiaryDestructive&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        buttonState = ButtonState.Destructive,
        onClick = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;LargeTertiaryDisabled&quot;,
      value = ButtonData(
        buttonSize = ButtonSize.Large(),
        buttonType = ButtonType.WithText(
          label = &quot;LargeTertiaryDisabled&quot;.toLabel(),
        ),
        buttonVariant = ButtonVariant.Tertiary,
        buttonState = ButtonState.Disabled,
        onClick = {},
      ),
    ),
  )
}
