# api-rest-meetings

BlueJeans Meetings REST API
- API version: 1.0.4407232018

 ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 

  For more information, please visit [http://bluejeans.com/](http://bluejeans.com/)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bluejeans</groupId>
  <artifactId>api-rest-meetings</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.bluejeans:api-rest-meetings:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-rest-meetings-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.bluejeans.api.rest.meetings.*;
import com.bluejeans.api.rest.meetings.auth.*;
import com.bluejeans.api.rest.meetings.model.*;
import com.bluejeans.api.rest.meetings.api.ApplicationApi;

import java.io.File;
import java.util.*;

public class ApplicationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: access_token
        ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
        access_token.setApiKey("YOUR ACCESS TOKEN");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //access_token.setApiKeyPrefix("Token");

        ApplicationApi apiInstance = new ApplicationApi();
        Integer userId = 56; // Integer | The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint.
        Application application = new Application(); // Application | The information about the new client application.
        try {
            Application result = apiInstance.createClientApplication(userId, application);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#createClientApplication");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bluejeans.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationApi* | [**createClientApplication**](docs/ApplicationApi.md#createClientApplication) | **POST** /v1/user/{user_id}/developer_applications | Create Client Application
*ApplicationApi* | [**listClientApplications**](docs/ApplicationApi.md#listClientApplications) | **GET** /v1/user/{user_id}/developer_applications | List Client Applications
*ApplicationApi* | [**regenerateClientApplicationSecret**](docs/ApplicationApi.md#regenerateClientApplicationSecret) | **PUT** /v1/user/{user_id}/developer_applications/{client_id}/secret | Regenerate Client Application Secret
*ApplicationApi* | [**updateClientApplication**](docs/ApplicationApi.md#updateClientApplication) | **PUT** /v1/user/{user_id}/developer_applications/{client_id} | Update Client Application
*AuthenticationApi* | [**getAuthorizationCode**](docs/AuthenticationApi.md#getAuthorizationCode) | **GET** /oauth2/authorize | Get Authorization Code
*AuthenticationApi* | [**getTokenByClient**](docs/AuthenticationApi.md#getTokenByClient) | **POST** /oauth2/token?Client | Authentication via Client Grant Type
*AuthenticationApi* | [**getTokenByCode**](docs/AuthenticationApi.md#getTokenByCode) | **POST** /oauth2/token?Code | Authentication via Code Grant Type
*AuthenticationApi* | [**getTokenByMeeting**](docs/AuthenticationApi.md#getTokenByMeeting) | **POST** /oauth2/token?Meeting | Authentication via Meeting Grant Type
*AuthenticationApi* | [**getTokenByPassword**](docs/AuthenticationApi.md#getTokenByPassword) | **POST** /oauth2/token?Password | Authentication via Password Grant Type
*AuthenticationApi* | [**getTokenByRefresh**](docs/AuthenticationApi.md#getTokenByRefresh) | **POST** /oauth2/token?Refresh | Authentication via Refresh Grant Type
*AuthenticationApi* | [**getTokenInfo**](docs/AuthenticationApi.md#getTokenInfo) | **GET** /oauth2/tokenInfo | Validate a Token
*AuthenticationApi* | [**revokeAccessToken**](docs/AuthenticationApi.md#revokeAccessToken) | **DELETE** /oauth2/token?Revoke | Revoke Access Token
*CommandCenterApi* | [**getEndpointDistribution**](docs/CommandCenterApi.md#getEndpointDistribution) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/endpoints/distribution | Endpoint Distribution
*CommandCenterApi* | [**getEndpointDistributionV2**](docs/CommandCenterApi.md#getEndpointDistributionV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/endpoints/distribution_new | Endpoint Distribution
*CommandCenterApi* | [**getEnterpriseOverallSummary**](docs/CommandCenterApi.md#getEnterpriseOverallSummary) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/meetings/summary | Overall Enterprise Summary
*CommandCenterApi* | [**getEnterpriseUsersActive**](docs/CommandCenterApi.md#getEnterpriseUsersActive) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/users/active | Enterprise User Summary
*CommandCenterApi* | [**getFeedbackComments**](docs/CommandCenterApi.md#getFeedbackComments) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/feedback/comments | Survey Feedback Comments
*CommandCenterApi* | [**getFeedbackCommentsV2**](docs/CommandCenterApi.md#getFeedbackCommentsV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/feedback/comments | Survey Feedback Comments
*CommandCenterApi* | [**getFeedbackCount**](docs/CommandCenterApi.md#getFeedbackCount) | **GET** /v1/enterprise/{enterprise_id}/indigo/feedback/count | Survey Feedback Scores
*CommandCenterApi* | [**getFeedbackCountV2**](docs/CommandCenterApi.md#getFeedbackCountV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/feedback/count | Survey Feedback Scores
*CommandCenterApi* | [**getGeoMap**](docs/CommandCenterApi.md#getGeoMap) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/endpoints/location/countries | Geographic Demographics
*CommandCenterApi* | [**getMeetingEndpointsLiveByEnterprise**](docs/CommandCenterApi.md#getMeetingEndpointsLiveByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live/{meeting_uuid}/endpoints/ | List Live Meeting Endpoints by Enterprise
*CommandCenterApi* | [**getMeetingPastByEnterprise**](docs/CommandCenterApi.md#getMeetingPastByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/{meeting_uuid} | List Meeting Endpoints &amp; Stats by Enterprise
*CommandCenterApi* | [**getMeetingPastByUser**](docs/CommandCenterApi.md#getMeetingPastByUser) | **GET** /v1/user/{user_id}/indigo/meetings/{meeting_uuid} | List Meeting Endpoints &amp; Stats by User
*CommandCenterApi* | [**getMeetingUsage**](docs/CommandCenterApi.md#getMeetingUsage) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/meetings/usage | Meeting Usage Over Time
*CommandCenterApi* | [**getMeetingUsageV2**](docs/CommandCenterApi.md#getMeetingUsageV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/meetings/usage | Meeting Usage Over Time
*CommandCenterApi* | [**getMeetingsLiveByEnterprise**](docs/CommandCenterApi.md#getMeetingsLiveByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings/live | Live Meetings Summary by Enterprise
*CommandCenterApi* | [**getMeetingsPastByEnterprise**](docs/CommandCenterApi.md#getMeetingsPastByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/indigo/meetings | List Past Meetings by Enterprise
*CommandCenterApi* | [**getMeetingsPastByUser**](docs/CommandCenterApi.md#getMeetingsPastByUser) | **GET** /v1/user/{user_id}/indigo/meetings | List Past Meetings by User
*CommandCenterApi* | [**getRoiRanges**](docs/CommandCenterApi.md#getRoiRanges) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/roi_ranges | ROI Data
*CommandCenterApi* | [**getRoiRangesV2**](docs/CommandCenterApi.md#getRoiRangesV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/roi_ranges | ROI Data
*CommandCenterApi* | [**getTopUsers**](docs/CommandCenterApi.md#getTopUsers) | **GET** /v1/enterprise/{enterprise_id}/indigo/analytics/users/usage | Top Users
*CommandCenterApi* | [**getTopUsersV2**](docs/CommandCenterApi.md#getTopUsersV2) | **GET** /v2/enterprise/{enterprise_id}/indigo/analytics/users/usage | Top Users
*EnterpriseApi* | [**changeEnterpriseTags**](docs/EnterpriseApi.md#changeEnterpriseTags) | **PUT** /v1/enterprise/{enterpriseId}/tags | Set Enterprise Tags
*EnterpriseApi* | [**createEnterpriseUser**](docs/EnterpriseApi.md#createEnterpriseUser) | **POST** /v1/enterprise/{enterpriseId}/users | Create User
*EnterpriseApi* | [**exportUsers**](docs/EnterpriseApi.md#exportUsers) | **GET** /v1/enterprise/{enterprise_id}/users/export | Export Enterprise Users
*EnterpriseApi* | [**getEnterpriseTags**](docs/EnterpriseApi.md#getEnterpriseTags) | **GET** /v1/enterprise/{enterpriseId}/tags | List Enterprise Tags
*EnterpriseApi* | [**removeUser**](docs/EnterpriseApi.md#removeUser) | **DELETE** /v1/enterprise/{enterprise_id}/users/{user_id} | Remove Enterprise User
*EnterpriseApi* | [**searchUsers**](docs/EnterpriseApi.md#searchUsers) | **GET** /v1/enterprise/{enterpriseId}/users | Search for User(s)
*HistoryApi* | [**getHistoryByEnterprise**](docs/HistoryApi.md#getHistoryByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/meeting_history/{meeting_guid} | Get Meeting History by Enterprise
*HistoryApi* | [**getHistoryByUser**](docs/HistoryApi.md#getHistoryByUser) | **GET** /v1/user/{user_id}/meeting_history/{meeting_guid} | Get Meeting History by User
*HistoryApi* | [**getHistorySharingByUser**](docs/HistoryApi.md#getHistorySharingByUser) | **GET** /v1/user/{user_id}/meeting_history/{meeting_guid}/sharing | Get Meeting History Sharing by User
*HistoryApi* | [**getRecording**](docs/HistoryApi.md#getRecording) | **GET** /v1/user/{user_id}/meeting_history/recordings/{recording_entity_id} | Get Recording
*HistoryApi* | [**listHistoryByEnterprise**](docs/HistoryApi.md#listHistoryByEnterprise) | **GET** /v1/enterprise/{enterprise_id}/meeting_history | List History by Enterprise
*HistoryApi* | [**listHistoryByUser**](docs/HistoryApi.md#listHistoryByUser) | **GET** /v1/user/{user_id}/meeting_history | List History by User
*HistoryApi* | [**listRecordings**](docs/HistoryApi.md#listRecordings) | **GET** /v1/user/{user_id}/meeting_history/recordings | List Meeting Recordings
*MeetingApi* | [**cancelMeeting**](docs/MeetingApi.md#cancelMeeting) | **DELETE** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Cancel Meeting
*MeetingApi* | [**createMeeting**](docs/MeetingApi.md#createMeeting) | **POST** /v1/user/{user_id}/scheduled_meeting | Create Meeting
*MeetingApi* | [**dialoutPstn**](docs/MeetingApi.md#dialoutPstn) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/dialout/pstn | Dialout via PSTN
*MeetingApi* | [**generatePairingCodePstn**](docs/MeetingApi.md#generatePairingCodePstn) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/PSTN | Generate Pairing Code (PSTN)
*MeetingApi* | [**generatePairingCodeSip**](docs/MeetingApi.md#generatePairingCodeSip) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/SIP | Generate Pairing Code (SIP)
*MeetingApi* | [**generatePairingCodeWebRtc**](docs/MeetingApi.md#generatePairingCodeWebRtc) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/webrtc | Generate Pairing Code (WebRTC)
*MeetingApi* | [**getEndpointLayout**](docs/MeetingApi.md#getEndpointLayout) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout | Get Endpoint Layout
*MeetingApi* | [**getMeeting**](docs/MeetingApi.md#getMeeting) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Get Meeting
*MeetingApi* | [**getMeetingEmails**](docs/MeetingApi.md#getMeetingEmails) | **GET** /v1/user/{user_id}/scheduled_meeting/{meeting_id}/emails | Get Meeting Email
*MeetingApi* | [**getMeetingEndpoint**](docs/MeetingApi.md#getMeetingEndpoint) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid} | Get Endpoint Information
*MeetingApi* | [**getMeetingEndpoints**](docs/MeetingApi.md#getMeetingEndpoints) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints | List Meeting Endpoints
*MeetingApi* | [**getMeetingNumbers**](docs/MeetingApi.md#getMeetingNumbers) | **GET** /v1/user/{user_id}/meetings/{meeting_id}/numbers | Get Meeting Join Info
*MeetingApi* | [**getMeetingState**](docs/MeetingApi.md#getMeetingState) | **GET** /v1/user/{user_id}/live_meetings/{numeric_meeting_id} | Get Meeting State
*MeetingApi* | [**listMeetings**](docs/MeetingApi.md#listMeetings) | **GET** /v1/user/{user_id}/scheduled_meeting | List Meetings
*MeetingApi* | [**sendMeetingInvite**](docs/MeetingApi.md#sendMeetingInvite) | **POST** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/invite | Send Email Invite
*MeetingApi* | [**updateEndpointLayout**](docs/MeetingApi.md#updateEndpointLayout) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout | Update Endpoint Layout
*MeetingApi* | [**updateMeeting**](docs/MeetingApi.md#updateMeeting) | **PUT** /v1/user/{user_id}/scheduled_meeting/{meeting_id} | Update Meeting
*MeetingApi* | [**updateMeetingEndpoint**](docs/MeetingApi.md#updateMeetingEndpoint) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid} | Update Endpoint Video/Audio State
*MeetingApi* | [**updateMeetingEndpoints**](docs/MeetingApi.md#updateMeetingEndpoints) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints | Update Meeting Endpoints State
*MeetingApi* | [**updateMeetingState**](docs/MeetingApi.md#updateMeetingState) | **PUT** /v1/user/{user_id}/live_meetings/{numeric_meeting_id} | Update Meeting State
*RecordingApi* | [**createShareRecordings**](docs/RecordingApi.md#createShareRecordings) | **POST** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | Enable Recording Sharing
*RecordingApi* | [**deleteAllRecordingsByMeetingGuid**](docs/RecordingApi.md#deleteAllRecordingsByMeetingGuid) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_guid}/recordings/ | Delete All Recordings for a Specified Meeting GUID
*RecordingApi* | [**deleteRecordingChapter**](docs/RecordingApi.md#deleteRecordingChapter) | **DELETE** /v1/user/{user_id}/meeting_history/{meeting_id}/recordings/{recording_chapter_id}/ | Delete a Specified Recording Chapter
*RecordingApi* | [**deleteShareRecordings**](docs/RecordingApi.md#deleteShareRecordings) | **DELETE** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | Delete Recording Sharing
*RecordingApi* | [**getMeetingRecordings**](docs/RecordingApi.md#getMeetingRecordings) | **GET** /v1/user/{user_id}/meeting_history/{meeting_id}/recordings | Get All Recordings for a Specified Meeting ID
*RecordingApi* | [**getRecordingContent**](docs/RecordingApi.md#getRecordingContent) | **GET** /v1/user/{user_id}/cms/{content_id} | Get Recording Download Link
*RecordingApi* | [**getShareRecordings**](docs/RecordingApi.md#getShareRecordings) | **GET** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/ | List Recording Sharing
*RecordingApi* | [**modifyShareRecordings**](docs/RecordingApi.md#modifyShareRecordings) | **PUT** /v1/user/{user_id}/meeting_history/{meetingGuid}/sharing/{sharingId} | Modify Recording Sharing
*RecordingApi* | [**moveRecordingOwner**](docs/RecordingApi.md#moveRecordingOwner) | **POST** /v1/user/{user_id}/meeting_history/move_recordings/from_user/{originalOwner}/to_user/{newOwner} | Move Recording Ownership
*RecordingApi* | [**startRecording**](docs/RecordingApi.md#startRecording) | **POST** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings | Start Recording
*RecordingApi* | [**stopRecording**](docs/RecordingApi.md#stopRecording) | **PUT** /v1/user/{user_id}/live_meetings/{meeting_id}/recordings | Stop Recording
*UserApi* | [**changeUserTags**](docs/UserApi.md#changeUserTags) | **PUT** /v1/user/{userId}/tags | Set User Tags
*UserApi* | [**createRoom**](docs/UserApi.md#createRoom) | **POST** /v1/user/{user_id}/room | Create User’s Default Meeting Settings
*UserApi* | [**getEnterpriseProfile**](docs/UserApi.md#getEnterpriseProfile) | **GET** /v1/user/{user_id}/enterprise_profile | Get Enterprise Profile
*UserApi* | [**getGrantedApplications**](docs/UserApi.md#getGrantedApplications) | **GET** /v1/user/{user_id}/granted_applications | Get Granted Applications
*UserApi* | [**getGroups**](docs/UserApi.md#getGroups) | **GET** /v1/user/{user_id}/groups | Get User Feature Groups
*UserApi* | [**getPersonalMeeting**](docs/UserApi.md#getPersonalMeeting) | **GET** /v1/user/{user_id}/personal_meeting | Get Personal Meeting
*UserApi* | [**getRoom**](docs/UserApi.md#getRoom) | **GET** /v1/user/{user_id}/room | Get User’s Default Meeting Settings
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /v1/user/{user_id} | Get User Account Details
*UserApi* | [**getUserTags**](docs/UserApi.md#getUserTags) | **GET** /v1/user/{userId}/tags | List User Tags
*UserApi* | [**revokeGrantedApplication**](docs/UserApi.md#revokeGrantedApplication) | **DELETE** /v1/user/{user_id}/granted_applications/{client_id} | Remoke Granted Application
*UserApi* | [**setGroups**](docs/UserApi.md#setGroups) | **PUT** /v1/user/{user_id}/groups | Set User Feature Groups
*UserApi* | [**updatePeresonalMeeting**](docs/UserApi.md#updatePeresonalMeeting) | **PUT** /v1/user/{user_id}/personal_meeting | Update Personal Meeting
*UserApi* | [**updateRoom**](docs/UserApi.md#updateRoom) | **PUT** /v1/user/{user_id}/room | Update User’s Default Meeting Settings
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /v1/user/{user_id} | Update User Account Details


## Documentation for Models

 - [AnalyticsEndpointDistribution](docs/AnalyticsEndpointDistribution.md)
 - [AnalyticsEndpointDistributionDistribution](docs/AnalyticsEndpointDistributionDistribution.md)
 - [AnalyticsEndpointDistributionV2](docs/AnalyticsEndpointDistributionV2.md)
 - [AnalyticsEndpointDistributionV2DistributionNew](docs/AnalyticsEndpointDistributionV2DistributionNew.md)
 - [AnalyticsFeedbackComments](docs/AnalyticsFeedbackComments.md)
 - [AnalyticsFeedbackCommentsComments](docs/AnalyticsFeedbackCommentsComments.md)
 - [AnalyticsFeedbackScores](docs/AnalyticsFeedbackScores.md)
 - [AnalyticsRoiData](docs/AnalyticsRoiData.md)
 - [AnalyticsRoiDataRoiRanges](docs/AnalyticsRoiDataRoiRanges.md)
 - [AnalyticsTopUsers](docs/AnalyticsTopUsers.md)
 - [AnalyticsTopUsersUsage](docs/AnalyticsTopUsersUsage.md)
 - [AnalyticsUsage](docs/AnalyticsUsage.md)
 - [AnalyticsUsageUsage](docs/AnalyticsUsageUsage.md)
 - [Application](docs/Application.md)
 - [ApplicationList](docs/ApplicationList.md)
 - [ApplicationListInner](docs/ApplicationListInner.md)
 - [ApplicationSecret](docs/ApplicationSecret.md)
 - [Attendee](docs/Attendee.md)
 - [Content](docs/Content.md)
 - [ContentContentProperties](docs/ContentContentProperties.md)
 - [ContentContentPropertiesLevels](docs/ContentContentPropertiesLevels.md)
 - [CountriesCountRec](docs/CountriesCountRec.md)
 - [CountryEndpoint](docs/CountryEndpoint.md)
 - [DialoutPstn](docs/DialoutPstn.md)
 - [Endpoint](docs/Endpoint.md)
 - [EndpointIndigo](docs/EndpointIndigo.md)
 - [EndpointIndigoEndpointAttributes1](docs/EndpointIndigoEndpointAttributes1.md)
 - [EndpointIndigoLocation](docs/EndpointIndigoLocation.md)
 - [EndpointIndigoSummaryStats](docs/EndpointIndigoSummaryStats.md)
 - [EndpointIndigoTraceroute](docs/EndpointIndigoTraceroute.md)
 - [EndpointIndigoTracerouteTracePath](docs/EndpointIndigoTracerouteTracePath.md)
 - [EndpointLocationSummary](docs/EndpointLocationSummary.md)
 - [Endpoints](docs/Endpoints.md)
 - [EndpointsInner](docs/EndpointsInner.md)
 - [EndpointsInnerConnections](docs/EndpointsInnerConnections.md)
 - [Enterprise](docs/Enterprise.md)
 - [EnterpriseCreateUser](docs/EnterpriseCreateUser.md)
 - [EnterpriseDailyUsers](docs/EnterpriseDailyUsers.md)
 - [EnterpriseUserInfoComp](docs/EnterpriseUserInfoComp.md)
 - [EnterpriseUserList](docs/EnterpriseUserList.md)
 - [EnterpriseUserListUsers](docs/EnterpriseUserListUsers.md)
 - [EnterpriseUserSearch](docs/EnterpriseUserSearch.md)
 - [EnterpriseUsersActive](docs/EnterpriseUsersActive.md)
 - [Error](docs/Error.md)
 - [FilterHighLowTs](docs/FilterHighLowTs.md)
 - [FilterObject](docs/FilterObject.md)
 - [FilterSpecification](docs/FilterSpecification.md)
 - [FilterTs](docs/FilterTs.md)
 - [GrantClient](docs/GrantClient.md)
 - [GrantClientScope](docs/GrantClientScope.md)
 - [GrantCode](docs/GrantCode.md)
 - [GrantCodeScope](docs/GrantCodeScope.md)
 - [GrantCodeScopeAppPermissions](docs/GrantCodeScopeAppPermissions.md)
 - [GrantMeeting](docs/GrantMeeting.md)
 - [GrantMeetingScope](docs/GrantMeetingScope.md)
 - [GrantMeetingScopeMeeting](docs/GrantMeetingScopeMeeting.md)
 - [GrantPassword](docs/GrantPassword.md)
 - [GrantPasswordScope](docs/GrantPasswordScope.md)
 - [GrantRefresh](docs/GrantRefresh.md)
 - [GrantRefreshScope](docs/GrantRefreshScope.md)
 - [GrantRequestClient](docs/GrantRequestClient.md)
 - [GrantRequestCode](docs/GrantRequestCode.md)
 - [GrantRequestMeeting](docs/GrantRequestMeeting.md)
 - [GrantRequestPassword](docs/GrantRequestPassword.md)
 - [GrantRequestRefresh](docs/GrantRequestRefresh.md)
 - [GrantRequestRevoke](docs/GrantRequestRevoke.md)
 - [GrantedApplications](docs/GrantedApplications.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Layout](docs/Layout.md)
 - [Meeting](docs/Meeting.md)
 - [MeetingAdvancedMeetingOptions](docs/MeetingAdvancedMeetingOptions.md)
 - [MeetingAdvancedMeetingOptionsEditability](docs/MeetingAdvancedMeetingOptionsEditability.md)
 - [MeetingDeprecated](docs/MeetingDeprecated.md)
 - [MeetingDeprecatedAdvancedMeetingOptions](docs/MeetingDeprecatedAdvancedMeetingOptions.md)
 - [MeetingEmails](docs/MeetingEmails.md)
 - [MeetingEmailsModerator](docs/MeetingEmailsModerator.md)
 - [MeetingEmailsParticipant](docs/MeetingEmailsParticipant.md)
 - [MeetingEmailsProperty](docs/MeetingEmailsProperty.md)
 - [MeetingHistory](docs/MeetingHistory.md)
 - [MeetingHistoryLeaderInfo](docs/MeetingHistoryLeaderInfo.md)
 - [MeetingHistoryParticipantList](docs/MeetingHistoryParticipantList.md)
 - [MeetingHistorySharing](docs/MeetingHistorySharing.md)
 - [MeetingIndigo](docs/MeetingIndigo.md)
 - [MeetingIndigoList](docs/MeetingIndigoList.md)
 - [MeetingModerator](docs/MeetingModerator.md)
 - [MeetingRecurrencePattern](docs/MeetingRecurrencePattern.md)
 - [MeetingSharing](docs/MeetingSharing.md)
 - [MeetingSharingProperties](docs/MeetingSharingProperties.md)
 - [MeetingState](docs/MeetingState.md)
 - [MeetingStateRecordinginfo](docs/MeetingStateRecordinginfo.md)
 - [MeetingSummaryInfo](docs/MeetingSummaryInfo.md)
 - [MeetingsSummaryRec](docs/MeetingsSummaryRec.md)
 - [ModifySharing](docs/ModifySharing.md)
 - [Numbers](docs/Numbers.md)
 - [NumbersLabel](docs/NumbersLabel.md)
 - [NumbersNumbers](docs/NumbersNumbers.md)
 - [PairingCodePSTN](docs/PairingCodePSTN.md)
 - [PairingCodeSIP](docs/PairingCodeSIP.md)
 - [PairingCodeSIPTurnservers](docs/PairingCodeSIPTurnservers.md)
 - [PairingCodeWebRTC](docs/PairingCodeWebRTC.md)
 - [Partition](docs/Partition.md)
 - [PayloadDialout](docs/PayloadDialout.md)
 - [PayloadInvite](docs/PayloadInvite.md)
 - [PayloadMeetingState](docs/PayloadMeetingState.md)
 - [PayloadPairingCodePstn](docs/PayloadPairingCodePstn.md)
 - [PayloadPairingCodeSIP](docs/PayloadPairingCodeSIP.md)
 - [PayloadPairingCodeWebRTC](docs/PayloadPairingCodeWebRTC.md)
 - [PersonalMeetingRoom](docs/PersonalMeetingRoom.md)
 - [PersonalMeetingRoomAdvancedMeetingOptions](docs/PersonalMeetingRoomAdvancedMeetingOptions.md)
 - [PersonalMeetingRoomAdvancedMeetingOptionsEditability](docs/PersonalMeetingRoomAdvancedMeetingOptionsEditability.md)
 - [PersonalMeetingRoomAttendees](docs/PersonalMeetingRoomAttendees.md)
 - [PersonalMeetingRoomFirst](docs/PersonalMeetingRoomFirst.md)
 - [PersonalMeetingRoomLast](docs/PersonalMeetingRoomLast.md)
 - [PersonalMeetingRoomModerator](docs/PersonalMeetingRoomModerator.md)
 - [PersonalMeetingRoomNext](docs/PersonalMeetingRoomNext.md)
 - [RecepientOptionsComp](docs/RecepientOptionsComp.md)
 - [Recording](docs/Recording.md)
 - [RecordingHistory](docs/RecordingHistory.md)
 - [RecordingHistoryList](docs/RecordingHistoryList.md)
 - [RecordingMovedComp](docs/RecordingMovedComp.md)
 - [RecordingRecordingChapters](docs/RecordingRecordingChapters.md)
 - [RecordingSession](docs/RecordingSession.md)
 - [RecordingSessionStartedBy](docs/RecordingSessionStartedBy.md)
 - [RecordingSummary](docs/RecordingSummary.md)
 - [Room](docs/Room.md)
 - [ScheduleMeetingMinComp](docs/ScheduleMeetingMinComp.md)
 - [SetSharing](docs/SetSharing.md)
 - [StartEnd](docs/StartEnd.md)
 - [TagListComp](docs/TagListComp.md)
 - [User](docs/User.md)
 - [UserDeprecated](docs/UserDeprecated.md)
 - [UserId](docs/UserId.md)
 - [MeetingExtendedIndigo](docs/MeetingExtendedIndigo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### access_token

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

glenn@bluejeans.com

