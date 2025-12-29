package pl.gov.coi.common.ui.ds.checkbox.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pl.gov.coi.common.ui.ds.checkbox.common.model.CheckBoxType
import pl.gov.coi.common.ui.ds.errortext.ErrorText
import pl.gov.coi.common.ui.ds.helpertext.HelperText
import pl.gov.coi.common.ui.theme.AppTheme

@Composable
fun CheckBoxBottomText(type: CheckBoxType) {
  when (type) {
    is CheckBoxType.Error -&gt; type.errorText?.let { errorText -&gt;
      Spacer(modifier = Modifier.height(AppTheme.dimensions.spacing200))
      ErrorText(testTag = type.testTag?.let { tag -&gt; tag + &quot;ErrorText&quot; }, errorText = errorText)
    }
    is CheckBoxType.Helper -&gt; if (type.helperText.isNotBlank()) {
      Spacer(modifier = Modifier.height(AppTheme.dimensions.spacing200))
      HelperText(testTag = type.testTag?.let { tag -&gt; tag + &quot;HelperText&quot; }, type.helperText)
    }
    is CheckBoxType.Default -&gt; Unit
  }
}
