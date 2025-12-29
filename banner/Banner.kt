package pl.gov.coi.common.ui.ds.banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import pl.gov.coi.common.ui.ds.banner.provider.BannerPreviewParameterProvider
import pl.gov.coi.common.ui.ds.button.Button
import pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIcon
import pl.gov.coi.common.ui.ds.button.buttontext.ButtonText
import pl.gov.coi.common.ui.ds.custom.icon.Icon
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.theme.AppTheme

@Deprecated(message = &quot;This component is deprecated, please use DS component Alert.&quot;)
@Composable
fun Banner(
  data: BannerData,
) {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .wrapContentHeight()
      .background(
        color = when (data) {
          is BannerData.Error -&gt; AppTheme.colors.supportRed20
          is BannerData.HighEmphasisError -&gt; AppTheme.colors.supportRed100
          is BannerData.HighEmphasisInfo -&gt; AppTheme.colors.supportBlue100
          is BannerData.Info -&gt; AppTheme.colors.supportBlue20
        },
      ),
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(
          start = AppTheme.dimensions.spacing200,
          end = AppTheme.dimensions.spacing200,
          top = AppTheme.dimensions.spacing200,
          bottom = AppTheme.dimensions.spacing200,
        ),
    ) {
      Icon(
        data = data.iconData,
      )
      Spacer(modifier = Modifier.width(width = AppTheme.dimensions.spacing150))
      Column(
        modifier = Modifier.weight(weight = 1f),
      ) {
        data.title?.let { title -&gt;
          CustomText(
            label = title,
            style = AppTheme.typography.bodyLargeMedium,
            overflow = TextOverflow.Ellipsis,
            color = when (data) {
              is BannerData.Error, is BannerData.Info -&gt; Color.Black
              is BannerData.HighEmphasisError, is BannerData.HighEmphasisInfo -&gt; Color.White
            },
          )
          Spacer(
            modifier = Modifier
              .fillMaxWidth()
              .height(AppTheme.dimensions.spacing50),
          )
        }
        CustomText(
          label = data.bodyText,
          style = AppTheme.typography.bodyMediumRegular,
          color = when (data) {
            is BannerData.Error, is BannerData.Info -&gt; AppTheme.colors.neutral500
            is BannerData.HighEmphasisError, is BannerData.HighEmphasisInfo -&gt; AppTheme.colors.white
          },
        )
        when (data) {
          is BannerData.Error -&gt; data.buttonData?.let { buttonTextData -&gt;
            Spacer(
              modifier = Modifier.height(height = AppTheme.dimensions.spacing100),
            )
            ButtonText(data = buttonTextData)
          }
          is BannerData.HighEmphasisError -&gt; data.buttonData?.let { buttonData -&gt;
            Spacer(
              modifier = Modifier.height(height = AppTheme.dimensions.spacing100),
            )
            Button(data = buttonData)
          }
          is BannerData.HighEmphasisInfo -&gt; data.buttonData?.let { buttonData -&gt;
            Spacer(
              modifier = Modifier.height(height = AppTheme.dimensions.spacing100),
            )
            Button(data = buttonData)
          }
          is BannerData.Info -&gt; data.buttonData?.let { buttonTextData -&gt;
            Spacer(
              modifier = Modifier.height(height = AppTheme.dimensions.spacing100),
            )
            ButtonText(data = buttonTextData)
          }
        }
      }
      data.closeButtonData?.let { buttonData -&gt;
        Spacer(
          modifier = Modifier.width(width = AppTheme.dimensions.spacing150),
        )
        ButtonIcon(
          data = buttonData,
        )
      }
    }
  }
}

@Preview
@Composable
fun BannerHighEmphasisErrorFullPreview(
  @PreviewParameter(BannerPreviewParameterProvider::class) data: BannerData,
) {
  Banner(
    data = data,
  )
}
