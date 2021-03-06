# BlueJeansMeetingsRestApi
## Video That Works Where You Do.

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.4407232018
- Build package: io.swagger.codegen.languages.PhpClientCodegen
For more information, please visit [http://bluejeans.com/](http://bluejeans.com/)

## Requirements

PHP 5.5 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/bluejeans/api-rest-meetings.git"
    }
  ],
  "require": {
    "bluejeans/api-rest-meetings": "dev-php-repo"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/BlueJeansMeetingsRestApi/vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: access_token
$config = BlueJeansMeetingsRestApi\Configuration::getDefaultConfiguration()->setApiKey('access_token', 'YOUR_ACCESS_TOKEN');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = BlueJeansMeetingsRestApi\Configuration::getDefaultConfiguration()->setApiKeyPrefix('access_token', 'Bearer');

$apiInstance = new BlueJeansMeetingsRestApi\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$user_id = 56; // int | The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
$application = new \BlueJeansMeetingsRestApi\Model\Application(); // \BlueJeansMeetingsRestApi\Model\Application | The information about the new client application.

try {
    $result = $apiInstance->createClientApplication($user_id, $application);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->createClientApplication: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *https://api.bluejeans.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**createClientApplication**](docs/Api/ApplicationApi.md#createclientapplication) | **POST** /v1/user/{user_id}/developer_applications | Create Client Application
*ApplicationApi* | [**listClientApplications**](docs/Api/ApplicationApi.md#listclientapplications) | **GET** /v1/user/{user_id}/developer_applications | List Client Applications
*ApplicationApi* | [**regenerateClientApplicationSecret**](docs/Api/ApplicationApi.md#regenerateclientapplicationsecret) | **PUT** /v1/user/{user_id}/developer_applications/{client_id}/secret | Regenerate Client Application Secret
*ApplicationApi* | [**updateClientApplication**](docs/Api/ApplicationApi.md#updateclientapplication) | **PUT** /v1/user/{user_id}/developer_applications/{client_id} | Update Client Application
*AuthenticationApi* | [**getAuthorizationCode**](docs/Api/AuthenticationApi.md#getauthorizationcode) | **GET** /oauth2/authorize | Get Authorization Code
*AuthenticationApi* | [**getTokenByClient**](docs/Api/AuthenticationApi.md#gettokenbyclient) | **POST** /oauth2/token?Client | Authentication via Client Grant Type
*AuthenticationApi* | [**getTokenByCode**](docs/Api/AuthenticationApi.md#gettokenbycode) | **POST** /oauth2/token?Code | Authentication via Code Grant Type
*AuthenticationApi* | [**getTokenByMeeting**](docs/Api/AuthenticationApi.md#gettokenbymeeting) | **POST** /oauth2/token?Meeting | Authentication via Meeting Grant Type
*AuthenticationApi* | [**getTokenByPassword**](docs/Api/AuthenticationApi.md#gettokenbypassword) | **POST** /oauth2/token?Password | Authentication via Password Grant Type
*AuthenticationApi* | [**getTokenByRefresh**](docs/Api/AuthenticationApi.md#gettokenbyrefresh) | **POST** /oauth2/token?Refresh | Authentication via Refresh Grant Type
*AuthenticationApi* | [**getTokenInfo**](docs/Api/AuthenticationApi.md#gettokeninfo) | **GET** /oauth2/tokenInfo | Validate a Token
*AuthenticationApi* | [**revokeAccessToken**](docs/Api/AuthenticationApi.md#revokeaccesstoken) | **DELETE** /oauth2/token?Revoke | Revoke Access Token
*CommandCenterApi* | [**getEndpointDistribution**](docs/Api/CommandCenterApi.md#getendpointdistribution) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/endpoints/distribution | Endpoint Distribution
*CommandCenterApi* | [**getEndpointDistributionV2**](docs/Api/CommandCenterApi.md#getendpointdistributionv2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/endpoints/distribution_new | Endpoint Distribution
*CommandCenterApi* | [**getEnterpriseOverallSummary**](docs/Api/CommandCenterApi.md#getenterpriseoverallsummary) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/meetings/summary | Overall Enterprise Summary
*CommandCenterApi* | [**getEnterpriseUsersActive**](docs/Api/CommandCenterApi.md#getenterpriseusersactive) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/users/active | Enterprise User Summary
*CommandCenterApi* | [**getFeedbackComments**](docs/Api/CommandCenterApi.md#getfeedbackcomments) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/feedback/comments | Survey Feedback Comments
*CommandCenterApi* | [**getFeedbackCommentsV2**](docs/Api/CommandCenterApi.md#getfeedbackcommentsv2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/feedback/comments | Survey Feedback Comments
*CommandCenterApi* | [**getFeedbackCount**](docs/Api/CommandCenterApi.md#getfeedbackcount) | **GET** /v1/enterprise/{enterprise_id}/indigo/feedback/count | Survey Feedback Scores
*CommandCenterApi* | [**getFeedbackCountV2**](docs/Api/CommandCenterApi.md#getfeedbackcountv2) | **GET** /v2/enterprise/{enterprise_id}/indigo/feedback/count | Survey Feedback Scores
*CommandCenterApi* | [**getGeoMap**](docs/Api/CommandCenterApi.md#getgeomap) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/endpoints/location/countries | Geographic Demographics
*CommandCenterApi* | [**getMeetingEndpointsLiveByEnterprise**](docs/Api/CommandCenterApi.md#getmeetingendpointslivebyenterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live/{meeting_uuid}/endpoints/ | List Live Meeting Endpoints by Enterprise
*CommandCenterApi* | [**getMeetingPastByEnterprise**](docs/Api/CommandCenterApi.md#getmeetingpastbyenterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/{meeting_uuid} | List Meeting Endpoints &amp; Stats by Enterprise
*CommandCenterApi* | [**getMeetingPastByUser**](docs/Api/CommandCenterApi.md#getmeetingpastbyuser) | **GET** /v1/user/{user_id}/indigo/meetings/{meeting_uuid} | List Meeting Endpoints &amp; Stats by User
*CommandCenterApi* | [**getMeetingUsage**](docs/Api/CommandCenterApi.md#getmeetingusage) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/meetings/usage | Meeting Usage Over Time
*CommandCenterApi* | [**getMeetingUsageV2**](docs/Api/CommandCenterApi.md#getmeetingusagev2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/meetings/usage | Meeting Usage Over Time
*CommandCenterApi* | [**getMeetingsLiveByEnterprise**](docs/Api/CommandCenterApi.md#getmeetingslivebyenterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live | Live Meetings Summary by Enterprise
*CommandCenterApi* | [**getMeetingsPastByEnterprise**](docs/Api/CommandCenterApi.md#getmeetingspastbyenterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings | List Past Meetings by Enterprise
*CommandCenterApi* | [**getMeetingsPastByUser**](docs/Api/CommandCenterApi.md#getmeetingspastbyuser) | **GET** /v1/user/{user_id}/indigo/meetings | List Past Meetings by User
*CommandCenterApi* | [**getRoiRanges**](docs/Api/CommandCenterApi.md#getroiranges) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/roi_ranges | ROI Data
*CommandCenterApi* | [**getRoiRangesV2**](docs/Api/CommandCenterApi.md#getroirangesv2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/roi_ranges | ROI Data
*CommandCenterApi* | [**getTopUsers**](docs/Api/CommandCenterApi.md#gettopusers) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/users/usage | Top Users
*CommandCenterApi* | [**getTopUsersV2**](docs/Api/CommandCenterApi.md#gettopusersv2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/users/usage | Top Users
*EnterpriseApi* | [**changeEnterpriseTags**](docs/Api/EnterpriseApi.md#changeenterprisetags) | **PUT** /v1/enterprise/{enterpriseId}/tags | Set Enterprise Tags
*EnterpriseApi* | [**createEnterpriseUser**](docs/Api/EnterpriseApi.md#createenterpriseuser) | **POST** /v1/enterprise/{enterpriseId}/users | Create User
*EnterpriseApi* | [**exportUsers**](docs/Api/EnterpriseApi.md#exportusers) | **GET** /v1/enterprise/{enterprise_id}/users/export | Export Enterprise Users
*EnterpriseApi* | [**getEnterpriseTags**](docs/Api/EnterpriseApi.md#getenterprisetags) | **GET** /v1/enterprise/{enterpriseId}/tags | List Enterprise Tags
*EnterpriseApi* | [**removeUser**](docs/Api/EnterpriseApi.md#removeuser) | **DELETE** /v1/enterprise/{enterprise_id}/users/{user_id} | Remove Enterprise User
*EnterpriseApi* | [**searchUsers**](docs/Api/EnterpriseApi.md#searchusers) | **GET** /v1/enterprise/{enterpriseId}/users | Search for User(s)
*HistoryApi* | [**getHistoryByEnterprise**](docs/Api/HistoryApi.md#gethistorybyenterprise) | **GET** /v1/enterprise/{enterprise_id}/meeting_history/{meeting_guid} | Get Meeting History by Enterprise
*HistoryApi* | [**getHistoryByUser**](docs/Api/HistoryApi.md#gethistorybyuser) | **GET** /v1/user/{user_id}/meeting_history/{meeting_guid} | Get Meeting History by User
*HistoryApi* | [**getHistorySharingByUser**](docs/Api/HistoryApi.md#gethistorysharingbyuser) | **GET** /v1/user/{user_id}/meeting_history/{meeting_guid}/sharing | Get Meeting History Sharing by User
*HistoryApi* | [**getRecording**](docs/Api/HistoryApi.md#getrecording) | **GET** /v1/user/{user_id}/meeting_history/recordings/{recording_entity_id} | Get Recording
*HistoryApi* | [**listHistoryByEnterprise**](docs/Api/HistoryApi.md#listhistorybyenterprise) | **GET** /v1/enterprise/{enterprise_id}/meeting_history | List History by Enterprise
*HistoryApi* | [**listHistoryByUser**](docs/Api/HistoryApi.md#listhistorybyuser) | **GET** /v1/user/{user_id}/meeting_history | List History by User
*HistoryApi* | [**listRecordings**](docs/Api/HistoryApi.md#listrecordings) | **GET** /v1/user/{user_id}/meeting_history/recordings | List Meeting Recordings
*MeetingApi* | [**cancelMeeting**](docs/Api/MeetingApi.md#cancelmeeting) | **DELETE** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Cancel Meeting
*MeetingApi* | [**createMeeting**](docs/Api/MeetingApi.md#createmeeting) | **POST** /v1/user/{user_id}/scheduled_meeting | Create Meeting
*MeetingApi* | [**dialoutPstn**](docs/Api/MeetingApi.md#dialoutpstn) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/dialout/pstn | Dialout via PSTN
*MeetingApi* | [**generatePairingCodePstn**](docs/Api/MeetingApi.md#generatepairingcodepstn) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/PSTN | Generate Pairing Code (PSTN)
*MeetingApi* | [**generatePairingCodeSip**](docs/Api/MeetingApi.md#generatepairingcodesip) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/SIP | Generate Pairing Code (SIP)
*MeetingApi* | [**generatePairingCodeWebRtc**](docs/Api/MeetingApi.md#generatepairingcodewebrtc) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/webrtc | Generate Pairing Code (WebRTC)
*MeetingApi* | [**getEndpointLayout**](docs/Api/MeetingApi.md#getendpointlayout) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout | Get Endpoint Layout
*MeetingApi* | [**getMeeting**](docs/Api/MeetingApi.md#getmeeting) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Get Meeting
*MeetingApi* | [**getMeetingEmails**](docs/Api/MeetingApi.md#getmeetingemails) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id}/emails | Get Meeting Email
*MeetingApi* | [**getMeetingEndpoint**](docs/Api/MeetingApi.md#getmeetingendpoint) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid} | Get Endpoint Information
*MeetingApi* | [**getMeetingEndpoints**](docs/Api/MeetingApi.md#getmeetingendpoints) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints | List Meeting Endpoints
*MeetingApi* | [**getMeetingNumbers**](docs/Api/MeetingApi.md#getmeetingnumbers) | **GET** /v1/user/{user_id}/meetings/{meeting_id}/numbers | Get Meeting Join Info
*MeetingApi* | [**getMeetingState**](docs/Api/MeetingApi.md#getmeetingstate) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id} | Get Meeting State
*MeetingApi* | [**listMeetings**](docs/Api/MeetingApi.md#listmeetings) | **GET** /v1/user/{user_id}/scheduled_meeting | List Meetings
*MeetingApi* | [**sendMeetingInvite**](docs/Api/MeetingApi.md#sendmeetinginvite) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/invite | Send Email Invite
*MeetingApi* | [**updateEndpointLayout**](docs/Api/MeetingApi.md#updateendpointlayout) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout | Update Endpoint Layout
*MeetingApi* | [**updateMeeting**](docs/Api/MeetingApi.md#updatemeeting) | **PUT** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Update Meeting
*MeetingApi* | [**updateMeetingEndpoint**](docs/Api/MeetingApi.md#updatemeetingendpoint) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid} | Update Endpoint Video/Audio State
*MeetingApi* | [**updateMeetingEndpoints**](docs/Api/MeetingApi.md#updatemeetingendpoints) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints | Update Meeting Endpoints State
*MeetingApi* | [**updateMeetingState**](docs/Api/MeetingApi.md#updatemeetingstate) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id} | Update Meeting State
*RecordingApi* | [**createShareRecordings**](docs/Api/RecordingApi.md#createsharerecordings) | **POST** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | Enable Recording Sharing
*RecordingApi* | [**deleteAllRecordingsByMeetingGuid**](docs/Api/RecordingApi.md#deleteallrecordingsbymeetingguid) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_guid}/recordings/ | Delete All Recordings for a Specified Meeting GUID
*RecordingApi* | [**deleteRecordingChapter**](docs/Api/RecordingApi.md#deleterecordingchapter) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_id}/recordings/{recording_chapter_id}/ | Delete a Specified Recording Chapter
*RecordingApi* | [**deleteShareRecordings**](docs/Api/RecordingApi.md#deletesharerecordings) | **DELETE** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | Delete Recording Sharing
*RecordingApi* | [**getMeetingRecordings**](docs/Api/RecordingApi.md#getmeetingrecordings) | **GET** /v1/user/{user_id}/meeting_history/{meeting_id}/recordings | Get All Recordings for a Specified Meeting ID
*RecordingApi* | [**getRecordingContent**](docs/Api/RecordingApi.md#getrecordingcontent) | **GET** /v1/user/{user_id}/cms/{content_id} | Get Recording Download Link
*RecordingApi* | [**getShareRecordings**](docs/Api/RecordingApi.md#getsharerecordings) | **GET** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | List Recording Sharing
*RecordingApi* | [**modifyShareRecordings**](docs/Api/RecordingApi.md#modifysharerecordings) | **PUT** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/{sharingId} | Modify Recording Sharing
*RecordingApi* | [**moveRecordingOwner**](docs/Api/RecordingApi.md#moverecordingowner) | **POST** /v1/user/{user_id}/meeting_history/move_recordings/from_user/{originalOwner}/to_user/{newOwner} | Move Recording Ownership
*RecordingApi* | [**startRecording**](docs/Api/RecordingApi.md#startrecording) | **POST** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings | Start Recording
*RecordingApi* | [**stopRecording**](docs/Api/RecordingApi.md#stoprecording) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings | Stop Recording
*UserApi* | [**changeUserTags**](docs/Api/UserApi.md#changeusertags) | **PUT** /v1/user/{userId}/tags | Set User Tags
*UserApi* | [**createRoom**](docs/Api/UserApi.md#createroom) | **POST** /v1/user/{user_id}/room | Create User’s Default Meeting Settings
*UserApi* | [**getEnterpriseProfile**](docs/Api/UserApi.md#getenterpriseprofile) | **GET** /v1/user/{user_id}/enterprise_profile | Get Enterprise Profile
*UserApi* | [**getGrantedApplications**](docs/Api/UserApi.md#getgrantedapplications) | **GET** /v1/user/{user_id}/granted_applications | Get Granted Applications
*UserApi* | [**getGroups**](docs/Api/UserApi.md#getgroups) | **GET** /v1/user/{user_id}/groups | Get User Feature Groups
*UserApi* | [**getPersonalMeeting**](docs/Api/UserApi.md#getpersonalmeeting) | **GET** /v1/user/{user_id}/personal_meeting | Get Personal Meeting
*UserApi* | [**getRoom**](docs/Api/UserApi.md#getroom) | **GET** /v1/user/{user_id}/room | Get User’s Default Meeting Settings
*UserApi* | [**getUser**](docs/Api/UserApi.md#getuser) | **GET** /v1/user/{user_id} | Get User Account Details
*UserApi* | [**getUserTags**](docs/Api/UserApi.md#getusertags) | **GET** /v1/user/{userId}/tags | List User Tags
*UserApi* | [**revokeGrantedApplication**](docs/Api/UserApi.md#revokegrantedapplication) | **DELETE** /v1/user/{user_id}/granted_applications/{client_id} | Remoke Granted Application
*UserApi* | [**setGroups**](docs/Api/UserApi.md#setgroups) | **PUT** /v1/user/{user_id}/groups | Set User Feature Groups
*UserApi* | [**updatePeresonalMeeting**](docs/Api/UserApi.md#updateperesonalmeeting) | **PUT** /v1/user/{user_id}/personal_meeting | Update Personal Meeting
*UserApi* | [**updateRoom**](docs/Api/UserApi.md#updateroom) | **PUT** /v1/user/{user_id}/room | Update User’s Default Meeting Settings
*UserApi* | [**updateUser**](docs/Api/UserApi.md#updateuser) | **PUT** /v1/user/{user_id} | Update User Account Details


## Documentation For Models

 - [AnalyticsEndpointDistribution](docs/Model/AnalyticsEndpointDistribution.md)
 - [AnalyticsEndpointDistributionDistribution](docs/Model/AnalyticsEndpointDistributionDistribution.md)
 - [AnalyticsEndpointDistributionV2](docs/Model/AnalyticsEndpointDistributionV2.md)
 - [AnalyticsEndpointDistributionV2DistributionNew](docs/Model/AnalyticsEndpointDistributionV2DistributionNew.md)
 - [AnalyticsFeedbackComments](docs/Model/AnalyticsFeedbackComments.md)
 - [AnalyticsFeedbackCommentsComments](docs/Model/AnalyticsFeedbackCommentsComments.md)
 - [AnalyticsFeedbackScores](docs/Model/AnalyticsFeedbackScores.md)
 - [AnalyticsRoiData](docs/Model/AnalyticsRoiData.md)
 - [AnalyticsRoiDataRoiRanges](docs/Model/AnalyticsRoiDataRoiRanges.md)
 - [AnalyticsTopUsers](docs/Model/AnalyticsTopUsers.md)
 - [AnalyticsTopUsersUsage](docs/Model/AnalyticsTopUsersUsage.md)
 - [AnalyticsUsage](docs/Model/AnalyticsUsage.md)
 - [AnalyticsUsageUsage](docs/Model/AnalyticsUsageUsage.md)
 - [Application](docs/Model/Application.md)
 - [ApplicationList](docs/Model/ApplicationList.md)
 - [ApplicationListInner](docs/Model/ApplicationListInner.md)
 - [ApplicationSecret](docs/Model/ApplicationSecret.md)
 - [Attendee](docs/Model/Attendee.md)
 - [Content](docs/Model/Content.md)
 - [ContentContentProperties](docs/Model/ContentContentProperties.md)
 - [ContentContentPropertiesLevels](docs/Model/ContentContentPropertiesLevels.md)
 - [CountriesCountRec](docs/Model/CountriesCountRec.md)
 - [CountryEndpoint](docs/Model/CountryEndpoint.md)
 - [DialoutPstn](docs/Model/DialoutPstn.md)
 - [Endpoint](docs/Model/Endpoint.md)
 - [EndpointIndigo](docs/Model/EndpointIndigo.md)
 - [EndpointIndigoEndpointAttributes1](docs/Model/EndpointIndigoEndpointAttributes1.md)
 - [EndpointIndigoLocation](docs/Model/EndpointIndigoLocation.md)
 - [EndpointIndigoSummaryStats](docs/Model/EndpointIndigoSummaryStats.md)
 - [EndpointIndigoTraceroute](docs/Model/EndpointIndigoTraceroute.md)
 - [EndpointIndigoTracerouteTracePath](docs/Model/EndpointIndigoTracerouteTracePath.md)
 - [EndpointLocationSummary](docs/Model/EndpointLocationSummary.md)
 - [Endpoints](docs/Model/Endpoints.md)
 - [EndpointsInner](docs/Model/EndpointsInner.md)
 - [EndpointsInnerConnections](docs/Model/EndpointsInnerConnections.md)
 - [Enterprise](docs/Model/Enterprise.md)
 - [EnterpriseCreateUser](docs/Model/EnterpriseCreateUser.md)
 - [EnterpriseDailyUsers](docs/Model/EnterpriseDailyUsers.md)
 - [EnterpriseUserInfoComp](docs/Model/EnterpriseUserInfoComp.md)
 - [EnterpriseUserList](docs/Model/EnterpriseUserList.md)
 - [EnterpriseUserListUsers](docs/Model/EnterpriseUserListUsers.md)
 - [EnterpriseUserSearch](docs/Model/EnterpriseUserSearch.md)
 - [EnterpriseUsersActive](docs/Model/EnterpriseUsersActive.md)
 - [Error](docs/Model/Error.md)
 - [FilterHighLowTs](docs/Model/FilterHighLowTs.md)
 - [FilterObject](docs/Model/FilterObject.md)
 - [FilterSpecification](docs/Model/FilterSpecification.md)
 - [FilterTs](docs/Model/FilterTs.md)
 - [GrantClient](docs/Model/GrantClient.md)
 - [GrantClientScope](docs/Model/GrantClientScope.md)
 - [GrantCode](docs/Model/GrantCode.md)
 - [GrantCodeScope](docs/Model/GrantCodeScope.md)
 - [GrantCodeScopeAppPermissions](docs/Model/GrantCodeScopeAppPermissions.md)
 - [GrantMeeting](docs/Model/GrantMeeting.md)
 - [GrantMeetingScope](docs/Model/GrantMeetingScope.md)
 - [GrantMeetingScopeMeeting](docs/Model/GrantMeetingScopeMeeting.md)
 - [GrantPassword](docs/Model/GrantPassword.md)
 - [GrantPasswordScope](docs/Model/GrantPasswordScope.md)
 - [GrantRefresh](docs/Model/GrantRefresh.md)
 - [GrantRefreshScope](docs/Model/GrantRefreshScope.md)
 - [GrantRequestClient](docs/Model/GrantRequestClient.md)
 - [GrantRequestCode](docs/Model/GrantRequestCode.md)
 - [GrantRequestMeeting](docs/Model/GrantRequestMeeting.md)
 - [GrantRequestPassword](docs/Model/GrantRequestPassword.md)
 - [GrantRequestRefresh](docs/Model/GrantRequestRefresh.md)
 - [GrantRequestRevoke](docs/Model/GrantRequestRevoke.md)
 - [GrantedApplications](docs/Model/GrantedApplications.md)
 - [InlineResponse200](docs/Model/InlineResponse200.md)
 - [Layout](docs/Model/Layout.md)
 - [Meeting](docs/Model/Meeting.md)
 - [MeetingAdvancedMeetingOptions](docs/Model/MeetingAdvancedMeetingOptions.md)
 - [MeetingAdvancedMeetingOptionsEditability](docs/Model/MeetingAdvancedMeetingOptionsEditability.md)
 - [MeetingDeprecated](docs/Model/MeetingDeprecated.md)
 - [MeetingDeprecatedAdvancedMeetingOptions](docs/Model/MeetingDeprecatedAdvancedMeetingOptions.md)
 - [MeetingEmails](docs/Model/MeetingEmails.md)
 - [MeetingEmailsModerator](docs/Model/MeetingEmailsModerator.md)
 - [MeetingEmailsParticipant](docs/Model/MeetingEmailsParticipant.md)
 - [MeetingEmailsProperty](docs/Model/MeetingEmailsProperty.md)
 - [MeetingHistory](docs/Model/MeetingHistory.md)
 - [MeetingHistoryLeaderInfo](docs/Model/MeetingHistoryLeaderInfo.md)
 - [MeetingHistoryParticipantList](docs/Model/MeetingHistoryParticipantList.md)
 - [MeetingHistorySharing](docs/Model/MeetingHistorySharing.md)
 - [MeetingIndigo](docs/Model/MeetingIndigo.md)
 - [MeetingIndigoList](docs/Model/MeetingIndigoList.md)
 - [MeetingModerator](docs/Model/MeetingModerator.md)
 - [MeetingRecurrencePattern](docs/Model/MeetingRecurrencePattern.md)
 - [MeetingSharing](docs/Model/MeetingSharing.md)
 - [MeetingSharingProperties](docs/Model/MeetingSharingProperties.md)
 - [MeetingState](docs/Model/MeetingState.md)
 - [MeetingStateRecordinginfo](docs/Model/MeetingStateRecordinginfo.md)
 - [MeetingSummaryInfo](docs/Model/MeetingSummaryInfo.md)
 - [MeetingsSummaryRec](docs/Model/MeetingsSummaryRec.md)
 - [ModifySharing](docs/Model/ModifySharing.md)
 - [Numbers](docs/Model/Numbers.md)
 - [NumbersLabel](docs/Model/NumbersLabel.md)
 - [NumbersNumbers](docs/Model/NumbersNumbers.md)
 - [PairingCodePSTN](docs/Model/PairingCodePSTN.md)
 - [PairingCodeSIP](docs/Model/PairingCodeSIP.md)
 - [PairingCodeSIPTurnservers](docs/Model/PairingCodeSIPTurnservers.md)
 - [PairingCodeWebRTC](docs/Model/PairingCodeWebRTC.md)
 - [Partition](docs/Model/Partition.md)
 - [PayloadDialout](docs/Model/PayloadDialout.md)
 - [PayloadInvite](docs/Model/PayloadInvite.md)
 - [PayloadMeetingState](docs/Model/PayloadMeetingState.md)
 - [PayloadPairingCodePstn](docs/Model/PayloadPairingCodePstn.md)
 - [PayloadPairingCodeSIP](docs/Model/PayloadPairingCodeSIP.md)
 - [PayloadPairingCodeWebRTC](docs/Model/PayloadPairingCodeWebRTC.md)
 - [PersonalMeetingRoom](docs/Model/PersonalMeetingRoom.md)
 - [PersonalMeetingRoomAdvancedMeetingOptions](docs/Model/PersonalMeetingRoomAdvancedMeetingOptions.md)
 - [PersonalMeetingRoomAdvancedMeetingOptionsEditability](docs/Model/PersonalMeetingRoomAdvancedMeetingOptionsEditability.md)
 - [PersonalMeetingRoomAttendees](docs/Model/PersonalMeetingRoomAttendees.md)
 - [PersonalMeetingRoomFirst](docs/Model/PersonalMeetingRoomFirst.md)
 - [PersonalMeetingRoomLast](docs/Model/PersonalMeetingRoomLast.md)
 - [PersonalMeetingRoomModerator](docs/Model/PersonalMeetingRoomModerator.md)
 - [PersonalMeetingRoomNext](docs/Model/PersonalMeetingRoomNext.md)
 - [RecepientOptionsComp](docs/Model/RecepientOptionsComp.md)
 - [Recording](docs/Model/Recording.md)
 - [RecordingHistory](docs/Model/RecordingHistory.md)
 - [RecordingHistoryList](docs/Model/RecordingHistoryList.md)
 - [RecordingMovedComp](docs/Model/RecordingMovedComp.md)
 - [RecordingRecordingChapters](docs/Model/RecordingRecordingChapters.md)
 - [RecordingSession](docs/Model/RecordingSession.md)
 - [RecordingSessionStartedBy](docs/Model/RecordingSessionStartedBy.md)
 - [RecordingSummary](docs/Model/RecordingSummary.md)
 - [Room](docs/Model/Room.md)
 - [ScheduleMeetingMinComp](docs/Model/ScheduleMeetingMinComp.md)
 - [SetSharing](docs/Model/SetSharing.md)
 - [StartEnd](docs/Model/StartEnd.md)
 - [TagListComp](docs/Model/TagListComp.md)
 - [User](docs/Model/User.md)
 - [UserDeprecated](docs/Model/UserDeprecated.md)
 - [UserId](docs/Model/UserId.md)
 - [MeetingExtendedIndigo](docs/Model/MeetingExtendedIndigo.md)


## Documentation For Authorization


## access_token

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string


## Author

glenn@bluejeans.com


