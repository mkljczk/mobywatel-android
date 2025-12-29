package pl.gov.coi.common.ui.ds.statusbadge

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.custom.icon.Icon
import pl.gov.coi.common.ui.ds.custom.icon.IconData
import pl.gov.coi.common.ui.ds.custom.icon.IconSize
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.theme.AppTheme

@Composable
fun StatusBadge(
  data: StatusBadgeData,
) {
  val modifier = if (data.withBorder) {
    Modifier
      .border(
        width = AppTheme.dimensions.strokeWidth,
        color = AppTheme.colors.neutral60,
        shape = AppTheme.shapes.radius300,
      )
      .background(
        color = AppTheme.colors.white,
        shape = AppTheme.shapes.radius300,
      )
      .padding(all = AppTheme.dimensions.spacing100)
  } else {
    Modifier
  }
  Row(
    modifier = modifier.semantics {
      contentDescription = &quot;${data.contentDescription.text} ${data.label.text}&quot;
    },
    horizontalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    when (data) {
      is StatusBadgeData.WithIcon -&gt; Icon(
        data = IconData.Standard(
          testTag = data.testTag?.let { tag -&gt; tag + &quot;Icon&quot; },
          iconResId = data.status.getIconResId(),
          contentDescription = Label.EMPTY,
          iconColorProvider = { data.status.getIconColor() },
          iconSize = IconSize.SIZE16,
        ),
      )

      is StatusBadgeData.WithDot -&gt; DotIcon(data = data)
    }
    CustomText(
      testTag = data.testTag?.let { tag -&gt; tag + &quot;Text&quot; },
      maxLines = data.maxLines,
      label = data.label,
      color = AppTheme.colors.neutral500,
      style = AppTheme.typography.bodySmallRegular.takeIf { data.withBorder }
        ?: AppTheme.typography.bodyLargeMedium,
      focusable = false,
      overflow = TextOverflow.Ellipsis,
    )
  }
}

@Composable
internal fun DotIcon(
  data: StatusBadgeData.WithDot,
) {
  Box(
    modifier = Modifier.size(AppTheme.dimensions.spacing200),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      data = IconData.Standard(
        testTag = data.testTag?.let { tag -&gt; tag + &quot;Icon&quot; },
        iconResId = R.drawable.e003_badge,
        contentDescription = Label.EMPTY,
        iconColorProvider = { data.status.getIconColor() },
        iconSize = IconSize.SIZE8,
      ),
    )
  }
}

private fun StatusBadgeWithIconStatus.getIconResId() =
  when (this) {
    StatusBadgeWithIconStatus.POSITIVE -&gt; R.drawable.b009_check_mark
    StatusBadgeWithIconStatus.INFORMATIVE -&gt; R.drawable.b008_info
    StatusBadgeWithIconStatus.NEGATIVE -&gt; R.drawable.b010_x_mark
    StatusBadgeWithIconStatus.NOTICE -&gt; R.drawable.b012_notice_mark
    StatusBadgeWithIconStatus.MINUS -&gt; R.drawable.b007_minus
  }

@Composable
private fun StatusBadgeWithIconStatus.getIconColor() = when (this) {
  StatusBadgeWithIconStatus.POSITIVE -&gt; AppTheme.colors.supportGreen100
  StatusBadgeWithIconStatus.INFORMATIVE -&gt; AppTheme.colors.supportBlue100
  StatusBadgeWithIconStatus.NEGATIVE -&gt; AppTheme.colors.supportRed100
  StatusBadgeWithIconStatus.NOTICE -&gt; Color.Unspecified
  StatusBadgeWithIconStatus.MINUS -&gt; AppTheme.colors.neutral200
}

@Composable
private fun StatusBadgeWithDotStatus.getIconColor() = when (this) {
  StatusBadgeWithDotStatus.POSITIVE -&gt; AppTheme.colors.supportGreen100
  StatusBadgeWithDotStatus.INFORMATIVE -&gt; AppTheme.colors.supportBlue100
  StatusBadgeWithDotStatus.NEGATIVE -&gt; AppTheme.colors.supportRed100
  StatusBadgeWithDotStatus.WARNING -&gt; AppTheme.colors.supportOrange100
}

@Composable
@Preview
fun StatusBadgePreview(@PreviewParameter(StatusBadgePreviewProvider::class) data: StatusBadgeData) {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .background(color = AppTheme.colors.background)
      .padding(all = AppTheme.dimensions.spacing200),
  ) {
    StatusBadge(
      data = data,
    )
  }
}
