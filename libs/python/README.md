# swagger_client
_Video That Works Where You Do, from the world's leader in cloud video communication._ # Authentication Each API request that is sent to BlueJeans requires an access token, which is obtained through the BlueJeans Authentication API. There are several methods (grant types) for obtaining an access token, which follow the OAuth2.0 specification. ## Grant Types * Authorization Code Grant – This grant type is used in an authentication flow commonly referred to as \"three-legged OAuth\". The user authenticates via a BlueJeans page, which provides an authorization code. This code, along with a few other elements, can be used to obtain an access code. * Password Credentials Grant – This grant type is used in a two-legged OAuth flow. Username and password are sent to retrieve an access code. * Client Credentials Grant – This grant type is used in a two-legged OAuth flow.  ## Access & Permissions The access level that is associated with each access token is referred to as the scope. There are three basic levels of access that BlueJeans allows, which affect the level of scope.  Three access levels exist within the Blue Jeans service today. * Meeting-level – Authentication takes place using a meeting ID and passcode, and the scope is limited to APIs that relate to the individual meeting. * User-level – Authentication either takes place via three-legged OAuth, or else a direct authorization token request containing a username or password. Access level depends on the requested scope permissions. * App-level – An application is provisioned either by BlueJeans personnel, or within the BlueJeans Enterprise Admin interface. When provisioning an app, a client key and secret are provided, which is then used to obtain an access token, via the BlueJeans Authentication API. The scope that is associated with the token will provide access to an entire enterprise and all of its users.  All endpoints in this document that require Enterprise Admin access will be marked as such. ## Testing In order to make effective use of this page, you will first use one of the authentication methods to obtain an access token. Once the token is given, use the Authenticate button up in the header to store the token. Each BlueJeans API called after that will use the access token provided. 

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build date: 2017-01-30T17:01:38.880-07:00
- Build package: class io.swagger.codegen.languages.PythonClientCodegen
For more information, please visit [http://bluejeans.com/](http://bluejeans.com/)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: access_token
swagger_client.configuration.api_key['access_token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['access_token'] = 'Bearer'
# create an instance of the API class
api_instance = swagger_client.AnalyticsApi
enterprise_id = 56 # int | The ID of the enterprise of interest. This value is an integer which can be retrieved for the current user via the Get Enterprise Profile endpoint.
filter = '[{\"type\":\"date\",\"comparison\":\"gt\",\"value\":\"2017-01-16T00:00:00-07:00\",\"field\":\"creation_time\"},{\"type\":\"date\",\"comparison\":\"lt\",\"value\":\"2017-01-23T23:59:59-07:00\",\"field\":\"creation_time\"}]' # str | URL-encoded JSON string (optional) (default to [{"type":"date","comparison":"gt","value":"2017-01-16T00:00:00-07:00","field":"creation_time"},{"type":"date","comparison":"lt","value":"2017-01-23T23:59:59-07:00","field":"creation_time"}])

try:
    # Endpoint Distribution
    api_response = api_instance.v1_enterprise_enterprise_id_indigo_analytics_endpoints_distribution_get(enterprise_id, filter=filter)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AnalyticsApi->v1_enterprise_enterprise_id_indigo_analytics_endpoints_distribution_get: %s\n" % e

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bluejeans.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_analytics_endpoints_distribution_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_analytics_endpoints_distribution_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/endpoints/distribution | Endpoint Distribution
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_analytics_feedback_comments_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_analytics_feedback_comments_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/feedback/comments | Survey Feedback Comments
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_analytics_meetings_usage_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_analytics_meetings_usage_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/meetings/usage | Meeting Usage Over Time
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_analytics_roi_ranges_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_analytics_roi_ranges_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/roi_ranges | ROI Data
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_analytics_users_usage_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_analytics_users_usage_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/users/usage | Top Users
*AnalyticsApi* | [**v1_enterprise_enterprise_id_indigo_feedback_count_get**](docs/AnalyticsApi.md#v1_enterprise_enterprise_id_indigo_feedback_count_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/feedback/count | Survey Feedback Scores
*AuthenticationApi* | [**oauth2_token_client_post**](docs/AuthenticationApi.md#oauth2_token_client_post) | **POST** /oauth2/token?Client | Authentication via Client Grant Type
*AuthenticationApi* | [**oauth2_token_meeting_post**](docs/AuthenticationApi.md#oauth2_token_meeting_post) | **POST** /oauth2/token?Meeting | Authentication via Meeting Grant Type
*AuthenticationApi* | [**oauth2_token_password_post**](docs/AuthenticationApi.md#oauth2_token_password_post) | **POST** /oauth2/token?Password | Authentication via Password Grant Type
*CommandCenterApi* | [**v1_enterprise_enterprise_id_indigo_meetings_get**](docs/CommandCenterApi.md#v1_enterprise_enterprise_id_indigo_meetings_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings | List Past Meetings by Enterprise
*CommandCenterApi* | [**v1_enterprise_enterprise_id_indigo_meetings_live_get**](docs/CommandCenterApi.md#v1_enterprise_enterprise_id_indigo_meetings_live_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live | Live Meetings Summary by Enterprise
*CommandCenterApi* | [**v1_enterprise_enterprise_id_indigo_meetings_live_meeting_guid_endpoints_get**](docs/CommandCenterApi.md#v1_enterprise_enterprise_id_indigo_meetings_live_meeting_guid_endpoints_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live/{meeting_guid}/endpoints/ | List Live Meeting Endpoints by Enterprise
*CommandCenterApi* | [**v1_enterprise_enterprise_id_indigo_meetings_meeting_guid_get**](docs/CommandCenterApi.md#v1_enterprise_enterprise_id_indigo_meetings_meeting_guid_get) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/{meeting_guid} | List Meeting Endpoints &amp; Stats by Enterprise
*CommandCenterApi* | [**v1_user_user_id_indigo_meetings_get**](docs/CommandCenterApi.md#v1_user_user_id_indigo_meetings_get) | **GET** /v1/user/{user_id}/indigo/meetings | List Past Meetings by User
*CommandCenterApi* | [**v1_user_user_id_indigo_meetings_meeting_guid_get**](docs/CommandCenterApi.md#v1_user_user_id_indigo_meetings_meeting_guid_get) | **GET** /v1/user/{user_id}/indigo/meetings/{meeting_guid} | List Meeting Endpoints &amp; Stats by User
*EnterpriseApi* | [**v1_enterprise_enterprise_id_users_get**](docs/EnterpriseApi.md#v1_enterprise_enterprise_id_users_get) | **GET** /v1/enterprise/{enterprise_id}/users | List Enterprise Users
*EnterpriseApi* | [**v1_enterprise_enterprise_id_users_post**](docs/EnterpriseApi.md#v1_enterprise_enterprise_id_users_post) | **POST** /v1/enterprise/{enterprise_id}/users | Create Enterprise User
*EnterpriseApi* | [**v1_enterprise_enterprise_id_users_user_id_delete**](docs/EnterpriseApi.md#v1_enterprise_enterprise_id_users_user_id_delete) | **DELETE** /v1/enterprise/{enterprise_id}/users/{user_id} | Remove Enterprise User
*EnterpriseApi* | [**v1_user_user_id_enterprise_profile_get**](docs/EnterpriseApi.md#v1_user_user_id_enterprise_profile_get) | **GET** /v1/user/{user_id}/enterprise_profile | Get Enterprise Profile
*HistoryApi* | [**v1_enterprise_enterprise_id_meeting_history_get**](docs/HistoryApi.md#v1_enterprise_enterprise_id_meeting_history_get) | **GET** /v1/enterprise/{enterprise_id}/meeting_history | List Meetings
*HistoryApi* | [**v1_enterprise_enterprise_id_meeting_history_meeting_guid_get**](docs/HistoryApi.md#v1_enterprise_enterprise_id_meeting_history_meeting_guid_get) | **GET** /v1/enterprise/{enterprise_id}/meeting_history/{meeting_guid} | List Meetings
*HistoryApi* | [**v1_user_user_id_meeting_history_get**](docs/HistoryApi.md#v1_user_user_id_meeting_history_get) | **GET** /v1/user/{user_id}/meeting_history | List Meetings
*HistoryApi* | [**v1_user_user_id_meeting_history_meeting_guid_get**](docs/HistoryApi.md#v1_user_user_id_meeting_history_meeting_guid_get) | **GET** /v1/user/{user_id}/meeting_history/{meeting_guid} | List Meetings
*HistoryApi* | [**v1_user_user_id_meeting_history_recordings_get**](docs/HistoryApi.md#v1_user_user_id_meeting_history_recordings_get) | **GET** /v1/user/{user_id}/meeting_history/recordings | List Meeting Recordings
*HistoryApi* | [**v1_user_user_id_meeting_history_recordings_recording_entity_id_get**](docs/HistoryApi.md#v1_user_user_id_meeting_history_recordings_recording_entity_id_get) | **GET** /v1/user/{user_id}/meeting_history/recordings/{recording_entity_id} | List Meeting Recordings
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_get**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints/{endpoint_guid} | Get Endpoint Information
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_layout_get**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_layout_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints/{endpoint_guid}/layout | Get Current Endpoint Layout
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_layout_put**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_layout_put) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints/{endpoint_guid}/layout | Update Endpoint Layout
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_put**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_endpoint_guid_put) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints/{endpoint_guid} | Update Endpoint Video/Audio State
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_get**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints | List Meeting Endpoints
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_endpoints_put**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_endpoints_put) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/endpoints | Update Meeting Endpoints State
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_get**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id} | Get Meeting State
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_invite_post**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_invite_post) | **POST** /v1/user/{user_id}/live_meetings/{meeting_id}/invite | Send Email Invite
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_pairing_code_sip_post**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_pairing_code_sip_post) | **POST** /v1/user/{user_id}/live_meetings/{meeting_id}/pairing_code/SIP | Generate SIP Pairing Code
*MeetingApi* | [**v1_user_user_id_live_meetings_meeting_id_put**](docs/MeetingApi.md#v1_user_user_id_live_meetings_meeting_id_put) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id} | Update Meeting State
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_get**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_get) | **GET** /v1/user/{user_id}/scheduled_meeting | Meeting
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_meeting_id_delete**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_meeting_id_delete) | **DELETE** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Meeting
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_meeting_id_emails_get**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_meeting_id_emails_get) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id}/emails | Meeting
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_meeting_id_get**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_meeting_id_get) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Meeting
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_meeting_id_put**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_meeting_id_put) | **PUT** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Meeting
*MeetingApi* | [**v1_user_user_id_scheduled_meeting_post**](docs/MeetingApi.md#v1_user_user_id_scheduled_meeting_post) | **POST** /v1/user/{user_id}/scheduled_meeting | Meeting
*RecordingApi* | [**v1_user_user_id_cms_content_idis_downloadabletrue_get**](docs/RecordingApi.md#v1_user_user_id_cms_content_idis_downloadabletrue_get) | **GET** /v1/user/{user_id}/cms/{content_id}?isDownloadable&#x3D;true | Get Recording Download Link
*RecordingApi* | [**v1_user_user_id_live_meetings_meeting_id_recordings_get**](docs/RecordingApi.md#v1_user_user_id_live_meetings_meeting_id_recordings_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings | Get All Recordings for a Specified Meeting ID
*RecordingApi* | [**v1_user_user_id_live_meetings_meeting_id_recordingsactionstart_post**](docs/RecordingApi.md#v1_user_user_id_live_meetings_meeting_id_recordingsactionstart_post) | **POST** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings?action&#x3D;start | Start Recording
*RecordingApi* | [**v1_user_user_id_live_meetings_meeting_id_recordingsactionstop_put**](docs/RecordingApi.md#v1_user_user_id_live_meetings_meeting_id_recordingsactionstop_put) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings?action&#x3D;stop | Stop Recording
*RecordingApi* | [**v1_user_user_id_live_meetings_meeting_id_recordingsmeeting_guidmeeting_guid_get**](docs/RecordingApi.md#v1_user_user_id_live_meetings_meeting_id_recordingsmeeting_guidmeeting_guid_get) | **GET** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings?meetingGuid&#x3D;{meeting_guid} | Get All Recordings for a Specified Meeting GUID
*RecordingApi* | [**v1_user_user_id_meeting_history_meeting_guid_recordings_delete**](docs/RecordingApi.md#v1_user_user_id_meeting_history_meeting_guid_recordings_delete) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_guid}/recordings | Delete All Recordings for a Specified Meeting GUID
*RecordingApi* | [**v1_user_user_id_meeting_history_meeting_id_recordings_recording_chapter_id_delete**](docs/RecordingApi.md#v1_user_user_id_meeting_history_meeting_id_recordings_recording_chapter_id_delete) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_id}/recordings/{recording_chapter_id}/ | Delete a Specified Recording Chapter
*UserApi* | [**v1_user_user_id_enterprise_profile_get**](docs/UserApi.md#v1_user_user_id_enterprise_profile_get) | **GET** /v1/user/{user_id}/enterprise_profile | Get Enterprise Profile
*UserApi* | [**v1_user_user_id_get**](docs/UserApi.md#v1_user_user_id_get) | **GET** /v1/user/{user_id} | Get User Account Details
*UserApi* | [**v1_user_user_id_put**](docs/UserApi.md#v1_user_user_id_put) | **PUT** /v1/user/{user_id} | Update User Account Details
*UserApi* | [**v1_user_user_id_room_get**](docs/UserApi.md#v1_user_user_id_room_get) | **GET** /v1/user/{user_id}/room | Get User’s Default Meeting Settings
*UserApi* | [**v1_user_user_id_room_put**](docs/UserApi.md#v1_user_user_id_room_put) | **PUT** /v1/user/{user_id}/room | Update User’s Default Meeting Settings
*UserApi* | [**v1_user_user_id_scheduled_meeting_get**](docs/UserApi.md#v1_user_user_id_scheduled_meeting_get) | **GET** /v1/user/{user_id}/scheduled_meeting | Meeting


## Documentation For Models

 - [AnalyticsEndpointDistribution](docs/AnalyticsEndpointDistribution.md)
 - [AnalyticsEndpointDistributionDistribution](docs/AnalyticsEndpointDistributionDistribution.md)
 - [AnalyticsFeedbackComments](docs/AnalyticsFeedbackComments.md)
 - [AnalyticsFeedbackCommentsComments](docs/AnalyticsFeedbackCommentsComments.md)
 - [AnalyticsFeedbackScores](docs/AnalyticsFeedbackScores.md)
 - [AnalyticsRoiData](docs/AnalyticsRoiData.md)
 - [AnalyticsRoiDataRoiRanges](docs/AnalyticsRoiDataRoiRanges.md)
 - [AnalyticsTopUsers](docs/AnalyticsTopUsers.md)
 - [AnalyticsTopUsersUsage](docs/AnalyticsTopUsersUsage.md)
 - [AnalyticsUsage](docs/AnalyticsUsage.md)
 - [AnalyticsUsageUsage](docs/AnalyticsUsageUsage.md)
 - [Content](docs/Content.md)
 - [ContentContentProperties](docs/ContentContentProperties.md)
 - [ContentContentPropertiesLevels](docs/ContentContentPropertiesLevels.md)
 - [Enterprise](docs/Enterprise.md)
 - [Error](docs/Error.md)
 - [Grant](docs/Grant.md)
 - [Meeting](docs/Meeting.md)
 - [Partition](docs/Partition.md)
 - [Payload](docs/Payload.md)
 - [Payload1](docs/Payload1.md)
 - [Payload2](docs/Payload2.md)
 - [Recording](docs/Recording.md)
 - [RecordingRecordingChapters](docs/RecordingRecordingChapters.md)
 - [RecordingRecordingSessions](docs/RecordingRecordingSessions.md)
 - [RecordingStartedBy](docs/RecordingStartedBy.md)
 - [RecordingSummary](docs/RecordingSummary.md)
 - [Room](docs/Room.md)
 - [Scope](docs/Scope.md)
 - [User](docs/User.md)


## Documentation For Authorization


## access_token

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string


## Author

brandon@bluejeans.com
