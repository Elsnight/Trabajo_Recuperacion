﻿using System;
using System.Threading;
using System.Threading.Tasks;
using Xamarin.Essentials;
using Xamarin.Forms;

namespace geoSport
{
    public class CetLocation
    {
		readonly bool stopping = false;
		public CetLocation()
		{
		}

		public async Task Run(CancellationToken token)
		{
			await Task.Run(async () => {
				while (!stopping)
				{
					token.ThrowIfCancellationRequested();
					try
					{
						await Task.Delay(300000);

						var request = new GeolocationRequest(GeolocationAccuracy.High);
						var location = await Geolocation.GetLocationAsync(request);
						if (location != null)
						{
							var message = new LocationMessage
							{
								Latitude = location.Latitude,
								Longitude = location.Longitude
							};

							Device.BeginInvokeOnMainThread(() =>
							{
								MessagingCenter.Send(message, "Location");
							});
						}
					}
					catch (Exception ex)
					{
						Device.BeginInvokeOnMainThread(() =>
						{
							var errormessage = new LocationErrorMessage();
							MessagingCenter.Send(errormessage, "LocationError");
						});
					}
				}
				return;
			}, token);
		}
	}
}
