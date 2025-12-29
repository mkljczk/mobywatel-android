package pl.gov.coi.common.ui.ds.singlecard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import pl.gov.coi.common.domain.label.Label
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.button.Button
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon
import pl.gov.coi.common.ui.ds.custom.icon.Icon
import pl.gov.coi.common.ui.ds.custom.icon.IconData
import pl.gov.coi.common.ui.ds.custom.icon.IconSize
import pl.gov.coi.common.ui.ds.switchcomponent.Switch
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.theme.AppTheme
import pl.gov.coi.common.ui.utils.NoRippleInteractionSource

@Composable
internal fun SingleCardInfo(data: SingleCardData.Info) {
  Card(
    modifier = data.modifier.semantics { testTag = data.testTag ?: data.title.tag },
    colors = CardDefaults.cardColors(containerColor = AppTheme.colors.white),
    shape = RoundedCornerShape(AppTheme.dimensions.spacing200),
  ) {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .defaultMinSize(minHeight = SINGLE_CARD_MINIMUM_HEIGHT)
        .fillMaxWidth()
        .padding(all = AppTheme.dimensions.spacing250),
    ) {
      when (data) {
        is SingleCardData.Info.Title -&gt; SingleCardInfoTitleContent(data = data)
        is SingleCardData.Info.TitleDescription -&gt; SingleCardInfoTitleDescriptionContent(data = data)
        is SingleCardData.Info.InfoTitle -&gt; SingleCardInfoTitleInfoContent(data = data)
        is SingleCardData.Info.IconTitle -&gt; SingleCardInfoTitleIconContent(data = data)
        is SingleCardData.Info.IconTitleDescription -&gt; SingleCardInfoTitleDescriptionIconContent(data = data)
        is SingleCardData.Info.TitleStatusBadge -&gt; SingleCardInfoTitleStatusBadgeContent(data = data)
        is SingleCardData.Info.IconTitleDescriptionLeadingButton -&gt;
          SingleCardInfoIconTitleDescriptionLeadingButtonContent(data = data)

        is SingleCardData.Info.ImageTitleDescriptionLeadingButton -&gt;
          SingleCardInfoImageTitleDescriptionLeadingButtonContent(data = data)
      }

      if (data.draggable) {
        Icon(
          modifier = Modifier.padding(start = AppTheme.dimensions.spacing200),
          data = IconData.Standard(
            testTag = data.testTag?.let { tag -&gt; tag + &quot;DraggableIcon&quot; },
            iconResId = R.drawable.aa040_handle_3,
            iconSize = IconSize.SIZE24,
            iconColorProvider = { Color.Unspecified },
            contentDescription = Label.EMPTY,
          ),
        )
      }
    }
  }
}

@Composable
internal fun SingleCardInfoTitleContent(
  data: SingleCardData.Info.Title,
) {
  fun toggleableModifier(): Modifier =
    if (data.extras is SingleCardInfoExtras.Switch) {
      Modifier.toggleable(
        role = Role.Switch,
        value = data.extras.switchData.checked,
        enabled = data.extras.switchData.enabled,
        onValueChange = { value -&gt; data.extras.switchData.onCheckedChange?.invoke(value) },
      )
    } else {
      Modifier
    }

  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .then(toggleableModifier()),
  ) {
    CustomText(
      testTag = data.testTag?.let { tag -&gt; tag + &quot;Text&quot; },
      label = data.title,
      style = AppTheme.typography.bodyLargeMedium,
      modifier = Modifier.weight(1f),
      color = when (data.cardState) {
        SingleCardInfoState.ENABLED -&gt; Color.Unspecified
        SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
      },
    )
    data.extras?.let { extra -&gt;
      Spacer(
        modifier = Modifier.width(width = AppTheme.dimensions.spacing100),
      )
      when (extra) {
        is SingleCardInfoExtras.ButtonMore -&gt; Button(data = extra.buttonData)
        is SingleCardInfoExtras.Switch -&gt; Switch(data = extra.switchData)
      }
    }
  }
}

@Composable
internal fun RowScope.SingleCardInfoTitleDescriptionContent(
  data: SingleCardData.Info.TitleDescription,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .weight(1f),
  ) {
    Column(
      verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
    ) {
      CustomText(
        label = data.title,
        style = AppTheme.typography.bodyLargeMedium,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; Color.Unspecified
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
      )
      CustomText(
        label = data.description,
        style = AppTheme.typography.bodyMediumRegular,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; Color.Unspecified
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
      )
    }
    data.extras?.let { extra -&gt;
      Spacer(modifier = Modifier.width(width = AppTheme.dimensions.spacing100))
      when (extra) {
        is SingleCardInfoExtras.ButtonMore -&gt; Button(data = extra.buttonData)
        is SingleCardInfoExtras.Switch -&gt; Switch(data = extra.switchData)
      }
    }
  }
}

@Composable
internal fun RowScope.SingleCardInfoTitleInfoContent(
  data: SingleCardData.Info.InfoTitle,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .weight(1f),
  ) {
    Column(
      verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
    ) {
      CustomText(
        label = data.info,
        style = AppTheme.typography.bodyMediumRegular,
        modifier = Modifier.fillMaxWidth(),
      )
      CustomText(
        label = data.title,
        style = AppTheme.typography.bodyLargeMedium,
        modifier = Modifier.fillMaxWidth(),
        maxLines = data.titleMaxLines,
        overflow = data.titleTextOverflow,
      )
    }
    data.extras?.let { extra -&gt;
      Spacer(modifier = Modifier.width(width = AppTheme.dimensions.spacing100))
      when (extra) {
        is SingleCardInfoExtras.ButtonMore -&gt; Button(data = extra.buttonData)
        is SingleCardInfoExtras.Switch -&gt; Switch(data = extra.switchData)
      }
    }
  }
}

@Composable
internal fun RowScope.SingleCardInfoTitleIconContent(
  data: SingleCardData.Info.IconTitle,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
      .fillMaxWidth()
      .weight(1f),
  ) {
    data.buttonIconData?.let { buttonDataIcon -&gt;
      ButtonIcon(
        data = buttonDataIcon,
      )
    } ?: run {
      Icon(data = data.iconData)
    }
    Spacer(
      modifier = Modifier.width(width = AppTheme.dimensions.spacing100),
    )
    CustomText(
      label = data.title,
      style = AppTheme.typography.bodyLargeMedium,
      modifier = Modifier.fillMaxWidth(),
      color = when (data.cardState) {
        SingleCardInfoState.ENABLED -&gt; Color.Unspecified
        SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
      },
      labelContentDescription = data.cardContentDescription,
    )
  }
}

@Composable
internal fun RowScope.SingleCardInfoTitleDescriptionIconContent(
  data: SingleCardData.Info.IconTitleDescription,
) {
  Row(
    verticalAlignment = when (data.iconOnOneLineWithTitle) {
      true -&gt; Alignment.Top
      false -&gt; Alignment.CenterVertically
    },
    modifier = Modifier
      .fillMaxWidth()
      .weight(1f),
  ) {
    data.buttonIconData?.let { buttonDataIcon -&gt;
      ButtonIcon(
        data = buttonDataIcon,
      )
    } ?: run {
      Icon(data = data.iconData)
    }
    Spacer(
      modifier = Modifier.width(width = AppTheme.dimensions.spacing200),
    )
    Column(
      verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
    ) {
      CustomText(
        label = data.title,
        style = AppTheme.typography.bodyLargeMedium,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; Color.Unspecified
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
        labelContentDescription = data.cardContentDescription,
      )
      CustomText(
        label = data.description,
        style = AppTheme.typography.bodyMediumRegular,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; Color.Unspecified
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
      )
    }
  }
}

@Composable
internal fun RowScope.SingleCardInfoTitleStatusBadgeContent(
  data: SingleCardData.Info.TitleStatusBadge,
) = with(data) {
  Column(
    verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
    modifier = Modifier
      .fillMaxWidth()
      .weight(1f),
  ) {
    CustomText(
      label = title,
      style = AppTheme.typography.bodyMediumRegular,
      modifier = Modifier.fillMaxWidth(),
      color = AppTheme.colors.neutral200,
    )
    SingleCardStatusBadge(data = badgeData)
  }
}

@Composable
internal fun RowScope.SingleCardInfoIconTitleDescriptionLeadingButtonContent(
  data: SingleCardData.Info.IconTitleDescriptionLeadingButton,
) {
  Row(
    verticalAlignment = when (data.iconOnOneLineWithTitle) {
      true -&gt; Alignment.Top
      false -&gt; Alignment.CenterVertically
    },
    modifier = Modifier
      .fillMaxWidth()
      .weight(weight = 1f),
  ) {
    Icon(data = data.iconData)
    Spacer(
      modifier = Modifier.width(width = AppTheme.dimensions.spacing200),
    )
    Column(
      verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
    ) {
      CustomText(
        label = data.title,
        maxLines = data.titleMaxLines,
        overflow = data.titleOverflow,
        style = AppTheme.typography.bodyLargeMedium,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; AppTheme.colors.neutral500
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
        labelContentDescription = data.cardContentDescription,
      )
      CustomText(
        label = data.description,
        style = AppTheme.typography.bodyMediumRegular,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; AppTheme.colors.neutral200
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
      )
    }
    Spacer(modifier = Modifier.width(width = AppTheme.dimensions.spacing100))
    data.leadingButtonData?.let { ButtonIcon(data = it) }
  }
}

@Composable
internal fun RowScope.SingleCardInfoImageTitleDescriptionLeadingButtonContent(
  data: SingleCardData.Info.ImageTitleDescriptionLeadingButton,
) {
  Row(
    verticalAlignment = when (data.iconOnOneLineWithTitle) {
      true -&gt; Alignment.Top
      false -&gt; Alignment.CenterVertically
    },
    modifier = Modifier
      .fillMaxWidth()
      .weight(weight = 1f),
  ) {
    Image(
      contentScale = ContentScale.Crop,
      modifier = Modifier
        .size(data.imageData.size.dimension)
        .clip(data.imageData.shapeProvider())
        .clickable(
          interactionSource = NoRippleInteractionSource(),
          indication = null,
          onClick = data.imageData.onClick,
        ),
      bitmap = data.imageData.image.asImageBitmap(),
      contentDescription = data.imageData.contentDescription.text,
    )
    Spacer(
      modifier = Modifier.width(width = AppTheme.dimensions.spacing200),
    )
    Column(
      verticalArrangement = Arrangement.spacedBy(space = AppTheme.dimensions.spacing50),
      modifier = Modifier
        .fillMaxWidth()
        .weight(weight = 1f),
    ) {
      CustomText(
        label = data.title,
        maxLines = data.titleMaxLines,
        overflow = data.titleOverflow,
        style = AppTheme.typography.bodyLargeMedium,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; AppTheme.colors.neutral500
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
        labelContentDescription = data.cardContentDescription,
      )
      CustomText(
        label = data.description,
        style = AppTheme.typography.bodyMediumRegular,
        modifier = Modifier.fillMaxWidth(),
        color = when (data.cardState) {
          SingleCardInfoState.ENABLED -&gt; AppTheme.colors.neutral200
          SingleCardInfoState.DISABLE -&gt; AppTheme.colors.neutral60
        },
      )
    }
    Spacer(modifier = Modifier.width(width = AppTheme.dimensions.spacing100))
    data.leadingButtonData?.let { ButtonIcon(data = it) }
  }
}
