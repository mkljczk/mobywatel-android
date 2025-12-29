package pl.gov.coi.common.ui.ds.radiobutton.provider

import android.content.Context
import androidx.compose.runtime.Composable
import pl.gov.coi.common.domain.Mapper
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.dropdownbutton.DropDownButton
import pl.gov.coi.common.ui.ds.dropdownbutton.DropDownButtonData
import pl.gov.coi.common.ui.preview.CustomWrappedDataPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestDataProvider
import pl.gov.coi.common.ui.preview.WrappedValue
import pl.gov.coi.common.ui.ds.radiobutton.RadioButtonData
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonCustomContent
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonItemData
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonRow
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonSupportText
import pl.gov.coi.common.ui.ds.radiobutton.common.model.RadioButtonVariant

class RadioButtonPPP : CustomWrappedDataPreviewParameterProvider&lt;
  Unit,
  RadioButtonData?,
  Mapper&lt;Unit, RadioButtonData?&gt;,
  RadioButtonData,
  &gt;() {

  override fun mapper(context: Context): Mapper&lt;Unit, RadioButtonData?&gt; = object : Mapper&lt;Unit, RadioButtonData?&gt; {
    override fun invoke(p1: Unit): RadioButtonData? = null
  }

  override val screenShotTestValues: Sequence&lt;ScreenShotTestDataProvider&lt;RadioButtonData&gt;&gt; = sequenceOf(
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonDefault&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.Default,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonDefaultDisabled&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.Default,
          selectedIndex = 0,
          enabled = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonDefaultWithOptionals&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.Default,
          selectedIndex = 0,
          label = provideLabel(),
          state = provideHelperText(),
          onClickHelperIcon = {},
          description = provideDescription(),
          content = CustomContent(),
        )
      },
    ),

    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonDefaultError&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.Default,
          selectedIndex = 1,
          label = provideLabel(),
          state = provideError(),
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonContentBox&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.ContentBox,
          selectedIndex = 0,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonContentBoxDisabled&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.ContentBox,
          selectedIndex = 0,
          enabled = false,
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonContentBoxWithOptionals&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.ContentBox,
          selectedIndex = 1,
          label = provideLabel(),
          state = provideHelperText(),
          onClickHelperIcon = {},
          description = provideDescription(),
          content = CustomContent(),
        )
      },
    ),
    ScreenShotTestDataProvider(
      screenShotTestName = &quot;RadioButtonContentBoxError&quot;,
      wrappedValue = WrappedValue {
        provideRadioButton(
          radioButtonVariant = RadioButtonVariant.ContentBox,
          selectedIndex = 1,
          label = provideLabel(),
          state = provideError(),
        )
      },
    ),
  )

  private fun provideRadioButton(
    radioButtonVariant: RadioButtonVariant,
    state: RadioButtonSupportText = RadioButtonSupportText.Helper(),
    selectedIndex: Int? = null,
    label: Label? = null,
    description: Label? = null,
    onClickHelperIcon: (() -&gt; Unit)? = null,
    content: RadioButtonCustomContent? = null,
    enabled: Boolean = true,
  ) = RadioButtonData(
    items = listOf(
      RadioButtonRow(
        onClick = {},
        label = provideLabel(),
        content = content,
        item = RadioButtonItemData(
          enabled = enabled,
          isSelected = selectedIndex == 0,
        ),
        description = description,
      ),
      RadioButtonRow(
        onClick = {},
        label = provideLabel(),
        content = content,
        item = RadioButtonItemData(
          enabled = enabled,
          isSelected = selectedIndex == 1,
        ),
      ),
    ),
    radioButtonVariant = radioButtonVariant,
    supportText = state,
    label = label,
    onClickHelperIcon = onClickHelperIcon,
  )

  private fun provideLabel() = &quot;Etykieta&quot;.toLabel(&quot;&quot;)

  private fun provideDescription() = &quot;Description&quot;.toLabel(&quot;&quot;)

  private fun provideHelperText() = RadioButtonSupportText.Helper(helperText = &quot;HelperText&quot;.toLabel(&quot;&quot;))

  private fun provideError() = RadioButtonSupportText.Error(errorText = &quot;Error&quot;.toLabel(&quot;&quot;))

  class CustomContent : RadioButtonCustomContent {
    override fun content(): @Composable () -&gt; Unit = {
      DropDownButton(
        data = DropDownButtonData(
          label = &quot;Test&quot;.toLabel(&quot;&quot;),
          items = listOf(
            &quot;Option 1&quot;.toLabel(&quot;&quot;),
            &quot;Option 2&quot;.toLabel(&quot;&quot;),
            &quot;Option 3&quot;.toLabel(&quot;&quot;),
          ),
          placeholder = &quot;Choose&quot;.toLabel(&quot;&quot;),
          onClick = {},
        ),
      )
    }
  }
}
