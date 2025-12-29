package pl.gov.coi.common.ui.ds.topappbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIconData
import pl.gov.coi.common.ui.theme.AppTheme

@Composable
internal fun TopAppBarButton(buttonIconData: ButtonIconData) {
  Box(
    modifier = Modifier
      .size(AppTheme.dimensions.spacing600)
      .clickable {
        buttonIconData.onClick()
      },
    contentAlignment = Alignment.Center,
  ) {
    ButtonIcon(data = buttonIconData)
  }
}

@Composable
internal fun MenuType?.CreateMenuButtons() = when (this) {
  is MenuType.Icon -&gt; TopAppBarButton(buttonIconData = menuButtonData.getButton())
  is MenuType.IconList -&gt; menuIconList.forEach { buttonData -&gt;
    TopAppBarButton(buttonIconData = buttonData.getButton())
  }

  null -&gt; Box(modifier = Modifier.size(AppTheme.dimensions.spacing600))
}

@Composable
internal fun NavigationButtonData?.CreateNavigationButton() = when (this) {
  null -&gt; Box(modifier = Modifier.size(AppTheme.dimensions.spacing600))
  else -&gt; TopAppBarButton(
    buttonIconData = ButtonIconData(
      iconResId = this.icon.iconResId,
      iconColorProvider = { AppTheme.colors.neutral200 },
      contentDescription = this.icon.contentDescription,
      onClick = this.onClick,
    ),
  )
}
