package pl.gov.coi.common.ui.ds.textarea.provider

import pl.gov.coi.common.ui.ds.textarea.CounterState
import pl.gov.coi.common.ui.ds.textarea.TextAreaData
import pl.gov.coi.common.ui.ds.textarea.TextAreaDataState
import pl.gov.coi.common.ui.ds.textarea.TextAreaType
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class TextAreaPPP : CustomPreviewParameterProvider&lt;TextAreaData&gt;() {
  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;TextAreaData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleEmpty&quot;,
      value = TextAreaData(
        type = TextAreaType.Flexible(),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Hidden,
        onValueChanged = {},
        state = TextAreaDataState.Default(),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithCounterAndLabel&quot;,
      value = TextAreaData(
        label = &quot;Flexible - WithCounterAndLabel&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        state = TextAreaDataState.Default(),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Visible(
          maxLength = 400,
          onCharsLimitReached = {},
        ),
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithLabel&quot;,
      value = TextAreaData(
        label = &quot;Flexible - WithLabel&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        state = TextAreaDataState.Default(),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Hidden,
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithCounterLabelAndHelper&quot;,
      value = TextAreaData(
        label = &quot;Flexible - WithCounterLabelAndHelper&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        state = TextAreaDataState.Default(helperLabel = &quot;HelperText&quot;.toLabel()),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Hidden,
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithCounterLabelAndHelperDisabled&quot;,
      value = TextAreaData(
        label = &quot;Flexible - FlexibleWithCounterLabelAndHelperDisabled&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        enabled = false,
        state = TextAreaDataState.Default(helperLabel = &quot;HelperText&quot;.toLabel()),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Visible(
          maxLength = 200,
        ),
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithCounterAndContentDisabled&quot;,
      value = TextAreaData(
        label = &quot;Flexible - FlexibleWithCounterAndContentDisabled&quot;.toLabel(),
        type = TextAreaType.Flexible(maxLines = 6),
        enabled = false,
        state = TextAreaDataState.Default(),
        counterState = CounterState.Visible(
          maxLength = 255,
        ),
        onValueChanged = {},
        content = &quot;TextArea content&quot;,
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FlexibleWithCounterLabelAndInvalid&quot;,
      value = TextAreaData(
        label = &quot;Flexible - WithCounterLabelAndInvalid&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        state = TextAreaDataState.Default(helperLabel = &quot;HelperText&quot;.toLabel()),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Visible(
          maxLength = 400,
          onCharsLimitReached = {},
        ),
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FixWithCounterLabelAndHelper&quot;,
      value = TextAreaData(
        label = &quot;Fix - WithCounterLabelAndHelper&quot;.toLabel(),
        type = TextAreaType.Fix(),
        state = TextAreaDataState.Default(helperLabel = &quot;HelperText&quot;.toLabel()),
        hint = &quot;Fix text area - hint&quot;.toLabel(),
        counterState = CounterState.Hidden,
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FixEmpty&quot;,
      value = TextAreaData(
        label = &quot;Fix - FixEmpty&quot;.toLabel(),
        type = TextAreaType.Fix(),
        state = TextAreaDataState.Default(helperLabel = &quot;HelperText&quot;.toLabel()),
        hint = &quot;Fix text area - hint&quot;.toLabel(),
        counterState = CounterState.Hidden,
        onValueChanged = {},
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;FixWithCounterLabelAndInvalid&quot;,
      value = TextAreaData(
        label = &quot;Fix - WithCounterLabelAndInvalid&quot;.toLabel(),
        type = TextAreaType.Flexible(),
        state = TextAreaDataState.Error(errorLabel = &quot;Invalid Fix&quot;.toLabel()),
        hint = &quot;Flexible text area - hint&quot;.toLabel(),
        counterState = CounterState.Visible(
          maxLength = 400,
          onCharsLimitReached = {},
        ),
        onValueChanged = {},
      ),
    ),
  )
}
