package pl.gov.coi.common.ui.ds.custom.singlecard.barcode

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.theme.AppTheme
import pl.gov.coi.common.ui.unmapped.singlecard.CustomContent
import pl.gov.coi.common.ui.unmapped.singlecard.CustomSingleCardData
import pl.gov.coi.common.ui.unmapped.singlecard.MediaSection
import pl.gov.coi.common.ui.unmapped.singlecard.SingleCard

class BarCodeSingleCard(val data: BarCodeSingleCardData) : CustomContent {
  @Composable
  override fun Content() {
    Column {
      CustomText(
        label = data.label,
        style = AppTheme.typography.bodyMediumRegular,
        color = AppTheme.colors.neutral200,
      )
      Spacer(modifier = Modifier.height(AppTheme.dimensions.spacing50))
      Image(
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth(),
        bitmap = data.barCodeImage.bitmap.asImageBitmap(),
        contentDescription = data.barCodeImage.contentDescription?.text,
      )
    }
  }
}

@Composable
@Preview
fun BarCodeSingleCardPreview() {
  SingleCard(
    singleCardData = CustomSingleCardData(
      oldTestTag = &quot;barCodeCard&quot;.toLabel(tag = &quot;barCodeCard&quot;),
      customContent =
      BarCodeSingleCard(
        data = BarCodeSingleCardData(
          label = &quot;Kod kreskowy&quot;.toLabel(tag = &quot;barcodeLabel&quot;),
          barCodeImage = MediaSection.Image(
            bitmap = provideBitmap(value = barCodeValue),
          ),
        ),
      ),
    ),
  )
}

private fun provideBitmap(value: String): Bitmap {
  val picture = Base64.decode(value, Base64.NO_WRAP)
  return BitmapFactory
    .decodeByteArray(picture, 0, picture.size)
}

private val barCodeValue =
  &quot;/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAQEBAQEBAQEBAQGBgUGBggHBwcHCAwJCQkJCQwTDA4MDA4MExEU&quot; +
    &quot;EA8QFBEeFxUVFx4iHRsdIiolJSo0MjRERFwBBAQEBAQEBAQEBAYGBQYGCAcHBwcIDAkJCQkJDBMMDgwMDgwTERQQDxAUER&quot; +
    &quot;4XFRUXHiIdGx0iKiUlKjQyNEREXP/CABEIADwBLAMBIgACEQEDEQH/xAAdAAACAgMBAQEAAAAAAAAAAAAHCAAGAgMFCQQ&quot; +
    &quot;B/9oACAEBAAAAAAV6B6MwEf10N86iq3ddnnT70eAhKWVjQBfkuPQD+o5ZU5wUJexHzhr79IRFh/QPRmAj+uhvnUVW7rs86f&quot; +
    &quot;ejwEJSysaAL8lx6Af1HLKnOChL2I+cNffpCIsP6B6MwEf10N86iq3ddnnT70eAhKWVjQBfkuPQD+o5ZU5wUJexHzhr79IR&quot; +
    &quot;Fh/QPRmAj+uhvnUVW7rs86fejwEJSysaAL8lx6Af1HLKnOChL2I+cNffpCIsP6B6MwEf10N86iq3ddnnT70eAhKWVjQBf&quot; +
    &quot;kuPQD+o5ZU5wUJexHzhr79IRF9Gx/MBcVRCTp9IMsogaBfXAFtwC5gFdpW8rCncUZXGGVNpljJ2vsVdXPWGSSST8GoG62H&quot; +
    &quot;WuOdHrlrvFyFHJtA0rbubZJJJJJJJJJzdtc6Hyd3Rxse5j1fhqvay+zofskkkk//EABYBAQEBAAAAAAAAAAAAAAAAAAABA&quot; +
    &quot;v/aAAgBAhAAAAAAAAAAAAAAAzpBQP/EABUBAQEAAAAAAAAAAAAAAAAAAAAB/9oACAEDEAAAAAAAAAAAAAABKIUP/8QAKRA&quot; +
    &quot;AAQMEAQMFAAIDAAAAAAAABgUHCAMENzg2ADI1AQIxMzQRMBIVQP/aAAgBAQABBQBrsOEWx77/ABH7qMOawbPz0d7P6yjup&quot; +
    &quot;1fVBleIEO8EXM/jXNVfzLt4pV+KSVwey/fJjFre7lImN6+sIPpfJTLUqM8h/iI96zQkylHzjLp4flRgtqMTtNt2/W183OEM&quot; +
    &quot;n+Ct9rXYcItj33+I/dRhzWDZ+ejvZ/WUd1Or6oMrxAh3gi5n8a5qr+ZdvFKvxSSuD2X75MYtb3cpExvX1hB9L5KZalRnkP8A&quot; +
    &quot;ER71mhJlKPnGXTw/KjBbUYnabbt+tr5ucIZP8Fb7Wuw4RbHvv8R+6jDmsGz89Hez+so7qdX1QZXiBDvBFzP41zVX8y7eKV&quot; +
    &quot;fiklcHsv3yYxa3u5SJjevrCD6XyUy1KjPIf4iPes0JMpR84y6eH5UYLajE7Tbdv1tfNzhDJ/grfa12HCLY99/iP3UYc1g2f&quot; +
    &quot;no72f1lHdTq+qDK8QId4IuZ/Guaq/mXbxSr8Ukrg9l++TGLW93KRMb19YQfS+SmWpUZ5D/ER71mhJlKPnGXTw/KjBbUYnab&quot; +
    &quot;bt+tr5ucIZP8Fb7Wuw4RbHvv8R+6jDmsGz89Hez+so7qdX1QZXiBDvBFzP41zVX8y7eKVfiklcHsv3yYxa3u5SJjevrCD6X&quot; +
    &quot;yUy1KjPIf4iPes0JMpR84y6eH5UYLajE7Tbdv1tfNzhDJ/grfaDx7c1CbtXFFq6eF1hVZK/Y1AqtifTItSaAzljYqtJbsuM&quot; +
    &quot;0ZsR9N2Gr48yKMGL1qwlQTW/ew7bMqfjSArNSY3Mm2Pjy5wK66OFL9kTKLEOPXUD1Kvl4CvwAmroLyDCuaNi3LTGo308wot&quot; +
    &quot;mgKINUZo0jUxvSi1DKsdXR9WTGmgOEqNr0R0dI1P30ju6B26g8z50nJ7SNEcCLJxoZBwWxOGjFVoRRjmPzmLzePqILZ41o&quot; +
    &quot;GwLloAEAtSZj8g3XagzLH4k02RY5wy2rPnIxa++JT1evv/p9enNNLgQQR33L7PK5qO+8jesQtroPdJrxwDOEEMvRZDtS9&quot; +
    &quot;w1RIHg5xTX2Ok2FQgpidF1ikiTUQhKEpRsb5ZI0tp02mkOOri7fKN/WFxaxFhe5v26cJcIl24OqVT/On/wAlRJSq6jfWN&quot; +
    &quot;kpWag3wAr+qILC416LAMEkNzYp9gk2SsjI69ZJoIDo1xWb8Duaiojo63Yo48Pjlt1bJSZa3nvaxsLit6B4j/pkUaGxmld&quot; +
    &quot;pSVf3P8en9f//EADwQAAAFAgIGBwYFBAMBAAAAAAECAwQFAAYHtAgREnZ3tRMhcnN0dbIUMTJxs8MVFiJBhSQwM0IQQFF&quot; +
    &quot;S/9oACAEBAAY/AMZ/NrNzylYc7pzP1C1g1xVtn1K1jbxYuX7VY4d+7z41jZ5XbGXPWmD3mHnoJURu1L+pejcO3uUUov&quot; +
    &quot;CxLlVYIcVXeSLVu9wjy09WR25Xl69aVXyjuVmrRN8BEcyrE3dOayalaIPmdu8urEDwjfMp1ofd5iH6D0v53C51OsQe6&quot; +
    &quot;ffarS93hvPIVH8THHLC1ffiHOYSqY8th8glV+fxfLkKwq4T3d6z1jr4Wf5UWrg3XcZpCr33+uD61YW7xXhmyVevbi88&quot; +
    &quot;lV1b92n9Y1Ys+Hl8wjWC3yt3mqtWb56plxrRg3ku7L0r2zVjP5tZueUrDndOZ+oWsGuKts+pWsbeLFy/arHDv3efGsb&quot; +
    &quot;PK7Yy560we8w89BKiN2pf1L0bh29yilF4WJcqrBDiq7yRat3uEeWnqyO3K8vXrSq+Udys1aJvgIjmVYm7pzWTUrRB8zt&quot; +
    &quot;3l1YgeEb5lOtD7vMQ/Qel/O4XOp1iD3T77VaXu8N55Co/iY45YWr78Q5zCVTHlsPkEqvz+L5chWFXCe7vWesdfCz/ACo&quot; +
    &quot;tXBuu4zSFXvv9cH1qwt3ivDNkq9e3F55Krq37tP6xqxZ8PL5hGsFvlbvNVas3z1TLjWjBvJd2XpXtmrGfzazc8pWHO6cz&quot; +
    &quot;9QtYNcVbZ9StY28WLl+1WOHfu8+NY2eV2xlz1pg95h56CVEbtS/qXo3Dt7lFKLwsS5VWCHFV3ki1bvcI8tPVkduV5evWl&quot; +
    &quot;V8o7lZq0TfARHMqxN3TmsmpWiD5nbvLqxA8I3zKdaH3eYh+g9L+dwudTrEHun32q0vd4bzyFR/ExxywtX34hzmEqmPLYf&quot; +
    &quot;IJVfn8Xy5CsKuE93es9Y6+Fn+VFq4N13GaQq99/rg+tWFu8V4ZslXr24vPJVdW/dp/WNWLPh5fMI1gt8rd5qrVm+eqZc&quot; +
    &quot;a0YN5Luy9K9s1Yz+bWbnlKw53TmfqFrBrirbPqVrG3ixcv2qxw793nxrGzyu2MuetMHvMPPQSojdqX9S9G4dvcopReFiX&quot; +
    &quot;KqwQ4qu8kWrd7hHlp6sjtyvL160qvlHcrNWib4CI5lWJu6c1k1K0QfM7d5dWIHhG+ZTrQ+7zEP0HpfzuFzqdYg90++1Wl&quot; +
    &quot;7vDeeQqP4mOOWFq+/EOcwlUx5bD5BKr8/i+XIVhVwnu71nrHXws/yotXBuu4zSFXvv8AXB9asLd4rwzZKvXtxeeSq6t+7&quot; +
    &quot;T+sasWfDy+YRrBb5W7zVWrN89Uy41owbyXdl6V7Zqxn82s3PKVhzunM/ULWDXFW2fUrWNvFi5ftVjh37vPjWNnldsZc9aYP&quot; +
    &quot;eYeeglRG7Uv6l6Nw7e5RSi8LEuVVghxVd5ItW73CPLT1ZHbleXr1pVfKO5WatE3wERzKsTd05rJqVog+Z27y6sQPCN8ynWh&quot; +
    &quot;93mIfoPS/ncLnU6xB7p99qtL3eG88hUfxMccsLV9+Ic5hKpjy2HyCVX5/F8uQrCrhPd3rPWOvhZ/lRauDddxmkKvff64PrVh&quot; +
    &quot;bvFeGbJV69uLzyVXVv3af1jViz4eXzCNYLfK3eaq1ZvnqmXGtGDeS7svSvbNWJFuP4tkEhMvrcXZkK9SMBiMHR1Vqs68W6&quot; +
    &quot;CZoePgZFk4VFQAOCzg5RIAErDgIVAigw99wsy821AT2WbQTiqYuvtViWEyiRMJm/ZqaZ7CgH22bvY6M46vcI7NYm3NcTFBG&quot; +
    &quot;OmlXJ2R03BFDG23YqhrKWsTbsdIJlippjCJMlAUAxjmaJGIoBi1pD/hTBA4Xae0BidpwQu2EWUoONvX8FMbIlG6RJlGGkWh&quot; +
    &quot;0yqgdMFXBlBIG2HaobBXbpFnvyc7iwSBUokB0q3OmUu32jUFhg3J+O/kQkN0QqF2PbAYdBs7farDJhKx7Yi0Lfa8y92HRDg&quot; +
    &quot;RmdsCQHqHxOQZNzW03SIU6wuCAp1Mjo/4+1Vs3ZcUYzSi2RnwrHSeJqGDpmiqROovbrHWScNkitro9j/Cx6UutToWIoG&quot; +
    &quot;2gD4NRqwBckjWuxarSPSldbtLWmZB70x9j/wC+qr3gYxMp30lAybJsQxgIUyzhudMgCJuoOs1aPbAjZIV7SfQ6svqXKAJ&quot; +
    &quot;EaM+hU2B/3/VV22xAokVk3zdEiBFFATKIkXIcdZh7NaPAyrFAn5SPd4y2w4IbYCVKYG+xq+OloOAQTVfGk4xyBDqAkXo2&quot; +
    &quot;7kipx1m/8KWrtxIfskAt5+k7K3XKuQTiKoJ7OslaQcMs0R9suyXuV1ElBYggqnINASREw/6azU1scIxl+MkvVWXFP21LY9&quot; +
    &quot;kMxBEDbVXRhq7YNguN4u4OiiDlMUxA6pD/AOSpK4oCKZrMFWUckQx3qSZhO3aERPV1XVb8W0UjXwsehOq8SSMPQs0kT1YSD&quot; +
    &quot;tg2KeLsKfhXWp0QQK8fmMKJKxTsebYoJTE2jKFZJkcpnIcXLAECazdupmcu1g1QZOINVkQyLoiwiqZdFX3E7FXMzm0CJLP&quot; +
    &quot;bql5JECKgprbuldpMR2asa34+LaHfxcvcTpyQzxMoAm/XKojVy2tbiCa0m8OxFEiipUiaknSahv1GqdgJCMaFfObpgJJIp&quot; +
    &quot;HiRii3ZKCZUav3EKUZoFgZRGRK2WI4IY5hXWTOXWQOzWGt+wjJA8HDFiAeKncETOQWr9VdTUTsGq3I20miK7lpKHcLgss&quot; +
    &quot;VEAIKIl956wRSlmDdM1tTNwupLYdENsJPkRIiJNXxUcwQ8dq8xQ/tkThWovbllVgYQjENW2u7UDqH9XVsJ/EYRqPnZa1Zx&quot; +
    &quot;hbEomkhdT+TdMVykkzm1EkdTRwuYgHMbYUqUI3ti0Zzo7OiziS5BOCSe07cdaIkRWpxDljLei30pbbhVjD2o4OpHHWbf&quot; +
    &quot;q6d+moCYpn/ZM5SABqLL3y1Yz95AdQk0nN6nK7ByU4625EF9oEEi/wCgFAANV4MsN3EvcyEfIIgeKbuiKtWSqpA2kGLh&quot; +
    &quot;4KSWwX4zpAqbYGm6zmMfWvLP5IkexQeMkJhw6OYu3qbpsXIpgbvD1GWHcL07xq/i13Y+2tWDZ6gdHrIOwwcLbBDgPuWAp&quot; +
    &quot;quh/E4kwEG0jLhnHDhsuxIuBP6k5v6051gEqY6urYAv6awkZtxYWw7vJi6cLyL1A6xETt/ci1SUMQBUX+JMT1cMC+nY&quot; +
    &quot;y83zBug4QaxZEGUqAKn2RBciqpW4EAOsg7RRqQbvIWXtZcwCkmqoswXcdYf5EuhO6T/T+22FY2xybx466F9B613q53C6g&quot; +
    &quot;nYAcROc9XKwZwH57upy5UB0+mFCGQjBP8KJnmyUECJa+pJABVqwbLxCucso4KcSNSvnZ0W0o7SL1JLaxHpSE19RDiNXEx&quot; +
    &quot;G22IuXluC8a25ZDgV2Anam61XCKpEzJOVeoiagABTFrC647ot+7TSgTTg5WH4aZFo2RM2HUgzT29aqge86pus1Jn2TE2igO&quot; +
    &quot;yYNRg1/+/8AVaS68Y0UkWyR027s6JDOESKfEVNQQ2ilN+4BTlhIs0HbNwmZJZu4TKqkqQwahKchwEDFH9wGmh5WxrfeHbNi&quot; +
    &quot;NUDOYxusKSCXwJE2yDspl/YtLFty24qKKsOtUI9mi1A/a6IpddA9uCz4OTdAQCAs+j0HKgFD9tpQojTePi2Ldmzbp7CLd&quot; +
    &quot;smVJFMofsQhNQFCjx05FM5FkcwCds8QIuiYSj1CJFAEB1U2dw9mQTBy3McyCrSOboHSMoGyYSGIUBKJgpuq4siAVVbqHWR&quot; +
    &quot;OeNbmMmoofpDHIIk6jGN1iIUeNmolnIMj6ttu8QIuibUPVrIcBDqpRnbsFHRbUym2ZBg1SbJicfeYSpAUBH/h6+axzV&quot; +
    &quot;F2/MQzxwkiQirgUi7BBVOUNZxKXqDa9wUoothxa51FDmOdQ8O0Mcwj+4iJKJbH5WiPwQFBEI72JH2MNYicRBHZ2Pf10q&quot; +
    &quot;hbduxkSksbbVJHtEmpTmAPeYEgLrGmDp9GtXLhkqZZosuiRRRuoJdkTJGMAiQwh1CIf3P/xAAiEQABAwMDBQAAAAAAAA&quot; +
    &quot;AAAAABAAIxESFhQXGhEiBQUcH/2gAIAQIBAT8A882x6tfibblcbJs109IWAacKQppgUUuJ3UNpnu//xAAjEQABAgQGAwA&quot; +
    &quot;AAAAAAAAAAAABABEhQlFxECAxQVBhYpHh/9oACAEDAQE/AOeMQy+I6m7o03qpiakn3gIP2XTQAspn8QM3/9k=&quot;
