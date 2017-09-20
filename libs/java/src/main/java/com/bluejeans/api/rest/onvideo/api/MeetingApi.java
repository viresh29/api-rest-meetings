/*
 * BlueJeans onVideo REST API
 *  ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.   <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by an access code.  THe access code can ensure security of participants who can join, and also designate user(s) who need an ability to moderate a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>, and may be assigned a moderator passcode allowing designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About onVideo Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.onvideo.api;

import com.bluejeans.api.rest.onvideo.ApiCallback;
import com.bluejeans.api.rest.onvideo.ApiClient;
import com.bluejeans.api.rest.onvideo.ApiException;
import com.bluejeans.api.rest.onvideo.ApiResponse;
import com.bluejeans.api.rest.onvideo.Configuration;
import com.bluejeans.api.rest.onvideo.Pair;
import com.bluejeans.api.rest.onvideo.ProgressRequestBody;
import com.bluejeans.api.rest.onvideo.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.bluejeans.api.rest.onvideo.model.DialoutPstn;
import com.bluejeans.api.rest.onvideo.model.Endpoint;
import com.bluejeans.api.rest.onvideo.model.Endpoints;
import com.bluejeans.api.rest.onvideo.model.Error;
import com.bluejeans.api.rest.onvideo.model.Layout;
import com.bluejeans.api.rest.onvideo.model.Meeting;
import com.bluejeans.api.rest.onvideo.model.MeetingState;
import com.bluejeans.api.rest.onvideo.model.Numbers;
import com.bluejeans.api.rest.onvideo.model.PairingCodeSIP;
import com.bluejeans.api.rest.onvideo.model.PairingCodeWebRTC;
import com.bluejeans.api.rest.onvideo.model.PayloadDialout;
import com.bluejeans.api.rest.onvideo.model.PayloadInvite;
import com.bluejeans.api.rest.onvideo.model.PayloadMeetingState;
import com.bluejeans.api.rest.onvideo.model.PayloadPairingCodePstn;
import com.bluejeans.api.rest.onvideo.model.PayloadPairingCodeSIP;
import com.bluejeans.api.rest.onvideo.model.PayloadPairingCodeWebRTC;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingApi {
    private ApiClient apiClient;

    public MeetingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MeetingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cancelMeeting
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelMeetingCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting/{meeting_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "meeting_id" + "\\}", apiClient.escapeString(meetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelMeetingValidateBeforeCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling cancelMeeting(Async)");
        }
        
        // verify the required parameter 'meetingId' is set
        if (meetingId == null) {
            throw new ApiException("Missing the required parameter 'meetingId' when calling cancelMeeting(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelMeetingCall(userId, meetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancel Meeting
     * This endpoint deletes a scheuled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void cancelMeeting(Integer userId, Integer meetingId) throws ApiException {
        cancelMeetingWithHttpInfo(userId, meetingId);
    }

    /**
     * Cancel Meeting
     * This endpoint deletes a scheuled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> cancelMeetingWithHttpInfo(Integer userId, Integer meetingId) throws ApiException {
        com.squareup.okhttp.Call call = cancelMeetingValidateBeforeCall(userId, meetingId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Cancel Meeting (asynchronously)
     * This endpoint deletes a scheuled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelMeetingAsync(Integer userId, Integer meetingId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelMeetingValidateBeforeCall(userId, meetingId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createMeeting
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meeting The details of the meeting. (required)
     * @param email If set to true, sends invitation emails to all listed participants. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMeetingCall(Integer userId, Meeting meeting, Boolean email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = meeting;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createMeetingValidateBeforeCall(Integer userId, Meeting meeting, Boolean email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling createMeeting(Async)");
        }
        
        // verify the required parameter 'meeting' is set
        if (meeting == null) {
            throw new ApiException("Missing the required parameter 'meeting' when calling createMeeting(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createMeetingCall(userId, meeting, email, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Meeting
     * This endpoint will create a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meeting The details of the meeting. (required)
     * @param email If set to true, sends invitation emails to all listed participants. (optional)
     * @return Meeting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Meeting createMeeting(Integer userId, Meeting meeting, Boolean email) throws ApiException {
        ApiResponse<Meeting> resp = createMeetingWithHttpInfo(userId, meeting, email);
        return resp.getData();
    }

    /**
     * Create Meeting
     * This endpoint will create a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meeting The details of the meeting. (required)
     * @param email If set to true, sends invitation emails to all listed participants. (optional)
     * @return ApiResponse&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Meeting> createMeetingWithHttpInfo(Integer userId, Meeting meeting, Boolean email) throws ApiException {
        com.squareup.okhttp.Call call = createMeetingValidateBeforeCall(userId, meeting, email, null, null);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Meeting (asynchronously)
     * This endpoint will create a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meeting The details of the meeting. (required)
     * @param email If set to true, sends invitation emails to all listed participants. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMeetingAsync(Integer userId, Meeting meeting, Boolean email, final ApiCallback<Meeting> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createMeetingValidateBeforeCall(userId, meeting, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dialoutPstn
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadDialout  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dialoutPstnCall(Integer userId, Integer numericMeetingId, PayloadDialout payloadDialout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadDialout;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/dialout/pstn"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dialoutPstnValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadDialout payloadDialout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling dialoutPstn(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling dialoutPstn(Async)");
        }
        
        // verify the required parameter 'payloadDialout' is set
        if (payloadDialout == null) {
            throw new ApiException("Missing the required parameter 'payloadDialout' when calling dialoutPstn(Async)");
        }
        
        
        com.squareup.okhttp.Call call = dialoutPstnCall(userId, numericMeetingId, payloadDialout, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Dialout via PSTN
     * Places a PSTN call to a user to join meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadDialout  (required)
     * @return List&lt;DialoutPstn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DialoutPstn> dialoutPstn(Integer userId, Integer numericMeetingId, PayloadDialout payloadDialout) throws ApiException {
        ApiResponse<List<DialoutPstn>> resp = dialoutPstnWithHttpInfo(userId, numericMeetingId, payloadDialout);
        return resp.getData();
    }

    /**
     * Dialout via PSTN
     * Places a PSTN call to a user to join meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadDialout  (required)
     * @return ApiResponse&lt;List&lt;DialoutPstn&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DialoutPstn>> dialoutPstnWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadDialout payloadDialout) throws ApiException {
        com.squareup.okhttp.Call call = dialoutPstnValidateBeforeCall(userId, numericMeetingId, payloadDialout, null, null);
        Type localVarReturnType = new TypeToken<List<DialoutPstn>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Dialout via PSTN (asynchronously)
     * Places a PSTN call to a user to join meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadDialout  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dialoutPstnAsync(Integer userId, Integer numericMeetingId, PayloadDialout payloadDialout, final ApiCallback<List<DialoutPstn>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dialoutPstnValidateBeforeCall(userId, numericMeetingId, payloadDialout, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DialoutPstn>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generatePairingCodePstn
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodePstn  (required)
     * @param role  (optional, default to USER)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodePstnCall(Integer userId, Integer numericMeetingId, PayloadPairingCodePstn payloadPairingCodePstn, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadPairingCodePstn;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/PSTN"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (role != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call generatePairingCodePstnValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadPairingCodePstn payloadPairingCodePstn, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling generatePairingCodePstn(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling generatePairingCodePstn(Async)");
        }
        
        // verify the required parameter 'payloadPairingCodePstn' is set
        if (payloadPairingCodePstn == null) {
            throw new ApiException("Missing the required parameter 'payloadPairingCodePstn' when calling generatePairingCodePstn(Async)");
        }
        
        
        com.squareup.okhttp.Call call = generatePairingCodePstnCall(userId, numericMeetingId, payloadPairingCodePstn, role, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Generate Pairing Code (PSTN)
     * This endpoint generates a PSTN pairing code that can be used to connect to a meeting via telephone.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodePstn  (required)
     * @param role  (optional, default to USER)
     * @return PairingCodeWebRTC
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PairingCodeWebRTC generatePairingCodePstn(Integer userId, Integer numericMeetingId, PayloadPairingCodePstn payloadPairingCodePstn, String role) throws ApiException {
        ApiResponse<PairingCodeWebRTC> resp = generatePairingCodePstnWithHttpInfo(userId, numericMeetingId, payloadPairingCodePstn, role);
        return resp.getData();
    }

    /**
     * Generate Pairing Code (PSTN)
     * This endpoint generates a PSTN pairing code that can be used to connect to a meeting via telephone.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodePstn  (required)
     * @param role  (optional, default to USER)
     * @return ApiResponse&lt;PairingCodeWebRTC&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PairingCodeWebRTC> generatePairingCodePstnWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadPairingCodePstn payloadPairingCodePstn, String role) throws ApiException {
        com.squareup.okhttp.Call call = generatePairingCodePstnValidateBeforeCall(userId, numericMeetingId, payloadPairingCodePstn, role, null, null);
        Type localVarReturnType = new TypeToken<PairingCodeWebRTC>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate Pairing Code (PSTN) (asynchronously)
     * This endpoint generates a PSTN pairing code that can be used to connect to a meeting via telephone.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodePstn  (required)
     * @param role  (optional, default to USER)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodePstnAsync(Integer userId, Integer numericMeetingId, PayloadPairingCodePstn payloadPairingCodePstn, String role, final ApiCallback<PairingCodeWebRTC> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = generatePairingCodePstnValidateBeforeCall(userId, numericMeetingId, payloadPairingCodePstn, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PairingCodeWebRTC>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generatePairingCodeSip
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeSIP Information about the device that will be joining via SIP. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodeSipCall(Integer userId, Integer numericMeetingId, PayloadPairingCodeSIP payloadPairingCodeSIP, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadPairingCodeSIP;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/SIP"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call generatePairingCodeSipValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadPairingCodeSIP payloadPairingCodeSIP, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling generatePairingCodeSip(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling generatePairingCodeSip(Async)");
        }
        
        // verify the required parameter 'payloadPairingCodeSIP' is set
        if (payloadPairingCodeSIP == null) {
            throw new ApiException("Missing the required parameter 'payloadPairingCodeSIP' when calling generatePairingCodeSip(Async)");
        }
        
        
        com.squareup.okhttp.Call call = generatePairingCodeSipCall(userId, numericMeetingId, payloadPairingCodeSIP, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Generate Pairing Code (SIP)
     * This endpoint generates a SIP pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeSIP Information about the device that will be joining via SIP. (required)
     * @return PairingCodeSIP
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PairingCodeSIP generatePairingCodeSip(Integer userId, Integer numericMeetingId, PayloadPairingCodeSIP payloadPairingCodeSIP) throws ApiException {
        ApiResponse<PairingCodeSIP> resp = generatePairingCodeSipWithHttpInfo(userId, numericMeetingId, payloadPairingCodeSIP);
        return resp.getData();
    }

    /**
     * Generate Pairing Code (SIP)
     * This endpoint generates a SIP pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeSIP Information about the device that will be joining via SIP. (required)
     * @return ApiResponse&lt;PairingCodeSIP&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PairingCodeSIP> generatePairingCodeSipWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadPairingCodeSIP payloadPairingCodeSIP) throws ApiException {
        com.squareup.okhttp.Call call = generatePairingCodeSipValidateBeforeCall(userId, numericMeetingId, payloadPairingCodeSIP, null, null);
        Type localVarReturnType = new TypeToken<PairingCodeSIP>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate Pairing Code (SIP) (asynchronously)
     * This endpoint generates a SIP pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeSIP Information about the device that will be joining via SIP. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodeSipAsync(Integer userId, Integer numericMeetingId, PayloadPairingCodeSIP payloadPairingCodeSIP, final ApiCallback<PairingCodeSIP> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = generatePairingCodeSipValidateBeforeCall(userId, numericMeetingId, payloadPairingCodeSIP, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PairingCodeSIP>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for generatePairingCodeWebRtc
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeWebRTC  (required)
     * @param role  (optional, default to USER)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodeWebRtcCall(Integer userId, Integer numericMeetingId, PayloadPairingCodeWebRTC payloadPairingCodeWebRTC, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadPairingCodeWebRTC;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/pairing_code/webrtc"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (role != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call generatePairingCodeWebRtcValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadPairingCodeWebRTC payloadPairingCodeWebRTC, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling generatePairingCodeWebRtc(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling generatePairingCodeWebRtc(Async)");
        }
        
        // verify the required parameter 'payloadPairingCodeWebRTC' is set
        if (payloadPairingCodeWebRTC == null) {
            throw new ApiException("Missing the required parameter 'payloadPairingCodeWebRTC' when calling generatePairingCodeWebRtc(Async)");
        }
        
        
        com.squareup.okhttp.Call call = generatePairingCodeWebRtcCall(userId, numericMeetingId, payloadPairingCodeWebRTC, role, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Generate Pairing Code (WebRTC)
     * This endpoint generates a WebRTC pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeWebRTC  (required)
     * @param role  (optional, default to USER)
     * @return PairingCodeWebRTC
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PairingCodeWebRTC generatePairingCodeWebRtc(Integer userId, Integer numericMeetingId, PayloadPairingCodeWebRTC payloadPairingCodeWebRTC, String role) throws ApiException {
        ApiResponse<PairingCodeWebRTC> resp = generatePairingCodeWebRtcWithHttpInfo(userId, numericMeetingId, payloadPairingCodeWebRTC, role);
        return resp.getData();
    }

    /**
     * Generate Pairing Code (WebRTC)
     * This endpoint generates a WebRTC pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeWebRTC  (required)
     * @param role  (optional, default to USER)
     * @return ApiResponse&lt;PairingCodeWebRTC&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PairingCodeWebRTC> generatePairingCodeWebRtcWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadPairingCodeWebRTC payloadPairingCodeWebRTC, String role) throws ApiException {
        com.squareup.okhttp.Call call = generatePairingCodeWebRtcValidateBeforeCall(userId, numericMeetingId, payloadPairingCodeWebRTC, role, null, null);
        Type localVarReturnType = new TypeToken<PairingCodeWebRTC>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate Pairing Code (WebRTC) (asynchronously)
     * This endpoint generates a WebRTC pairing code that can be used to connect to a meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadPairingCodeWebRTC  (required)
     * @param role  (optional, default to USER)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call generatePairingCodeWebRtcAsync(Integer userId, Integer numericMeetingId, PayloadPairingCodeWebRTC payloadPairingCodeWebRTC, String role, final ApiCallback<PairingCodeWebRTC> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = generatePairingCodeWebRtcValidateBeforeCall(userId, numericMeetingId, payloadPairingCodeWebRTC, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PairingCodeWebRTC>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpointLayout
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointLayoutCall(Integer userId, Integer numericMeetingId, String endpointGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()))
            .replaceAll("\\{" + "endpoint_guid" + "\\}", apiClient.escapeString(endpointGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointLayoutValidateBeforeCall(Integer userId, Integer numericMeetingId, String endpointGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getEndpointLayout(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling getEndpointLayout(Async)");
        }
        
        // verify the required parameter 'endpointGuid' is set
        if (endpointGuid == null) {
            throw new ApiException("Missing the required parameter 'endpointGuid' when calling getEndpointLayout(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getEndpointLayoutCall(userId, numericMeetingId, endpointGuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Endpoint Layout
     * This endpoint allows you to retrieve an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @return Layout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Layout getEndpointLayout(Integer userId, Integer numericMeetingId, String endpointGuid) throws ApiException {
        ApiResponse<Layout> resp = getEndpointLayoutWithHttpInfo(userId, numericMeetingId, endpointGuid);
        return resp.getData();
    }

    /**
     * Get Endpoint Layout
     * This endpoint allows you to retrieve an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @return ApiResponse&lt;Layout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Layout> getEndpointLayoutWithHttpInfo(Integer userId, Integer numericMeetingId, String endpointGuid) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointLayoutValidateBeforeCall(userId, numericMeetingId, endpointGuid, null, null);
        Type localVarReturnType = new TypeToken<Layout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Endpoint Layout (asynchronously)
     * This endpoint allows you to retrieve an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointLayoutAsync(Integer userId, Integer numericMeetingId, String endpointGuid, final ApiCallback<Layout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEndpointLayoutValidateBeforeCall(userId, numericMeetingId, endpointGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Layout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeeting
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. This is not the numeric meeting ID visible to users. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting/{meeting_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "meeting_id" + "\\}", apiClient.escapeString(meetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingValidateBeforeCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeeting(Async)");
        }
        
        // verify the required parameter 'meetingId' is set
        if (meetingId == null) {
            throw new ApiException("Missing the required parameter 'meetingId' when calling getMeeting(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingCall(userId, meetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Meeting
     * This endpoint gets the settings for a user&#39;s meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. This is not the numeric meeting ID visible to users. (required)
     * @return Meeting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Meeting getMeeting(Integer userId, Integer meetingId) throws ApiException {
        ApiResponse<Meeting> resp = getMeetingWithHttpInfo(userId, meetingId);
        return resp.getData();
    }

    /**
     * Get Meeting
     * This endpoint gets the settings for a user&#39;s meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. This is not the numeric meeting ID visible to users. (required)
     * @return ApiResponse&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Meeting> getMeetingWithHttpInfo(Integer userId, Integer meetingId) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingValidateBeforeCall(userId, meetingId, null, null);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Meeting (asynchronously)
     * This endpoint gets the settings for a user&#39;s meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. This is not the numeric meeting ID visible to users. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingAsync(Integer userId, Integer meetingId, final ApiCallback<Meeting> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingValidateBeforeCall(userId, meetingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeetingEmails
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param type TEXT, ICS, HTML (optional)
     * @param role moderator, participant (optional)
     * @param action create, edit, delete (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingEmailsCall(Integer userId, Integer meetingId, String type, String role, String action, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting/{meeting_id}/emails"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "meeting_id" + "\\}", apiClient.escapeString(meetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        if (role != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));
        if (action != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "action", action));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingEmailsValidateBeforeCall(Integer userId, Integer meetingId, String type, String role, String action, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeetingEmails(Async)");
        }
        
        // verify the required parameter 'meetingId' is set
        if (meetingId == null) {
            throw new ApiException("Missing the required parameter 'meetingId' when calling getMeetingEmails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingEmailsCall(userId, meetingId, type, role, action, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Meeting Email
     * This endpoint retrieves the email object for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param type TEXT, ICS, HTML (optional)
     * @param role moderator, participant (optional)
     * @param action create, edit, delete (optional)
     * @return Meeting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Meeting getMeetingEmails(Integer userId, Integer meetingId, String type, String role, String action) throws ApiException {
        ApiResponse<Meeting> resp = getMeetingEmailsWithHttpInfo(userId, meetingId, type, role, action);
        return resp.getData();
    }

    /**
     * Get Meeting Email
     * This endpoint retrieves the email object for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param type TEXT, ICS, HTML (optional)
     * @param role moderator, participant (optional)
     * @param action create, edit, delete (optional)
     * @return ApiResponse&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Meeting> getMeetingEmailsWithHttpInfo(Integer userId, Integer meetingId, String type, String role, String action) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingEmailsValidateBeforeCall(userId, meetingId, type, role, action, null, null);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Meeting Email (asynchronously)
     * This endpoint retrieves the email object for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param type TEXT, ICS, HTML (optional)
     * @param role moderator, participant (optional)
     * @param action create, edit, delete (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingEmailsAsync(Integer userId, Integer meetingId, String type, String role, String action, final ApiCallback<Meeting> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingEmailsValidateBeforeCall(userId, meetingId, type, role, action, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeetingEndpoint
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingEndpointCall(Integer userId, Integer numericMeetingId, String endpointGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()))
            .replaceAll("\\{" + "endpoint_guid" + "\\}", apiClient.escapeString(endpointGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingEndpointValidateBeforeCall(Integer userId, Integer numericMeetingId, String endpointGuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeetingEndpoint(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling getMeetingEndpoint(Async)");
        }
        
        // verify the required parameter 'endpointGuid' is set
        if (endpointGuid == null) {
            throw new ApiException("Missing the required parameter 'endpointGuid' when calling getMeetingEndpoint(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingEndpointCall(userId, numericMeetingId, endpointGuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Endpoint Information
     * This endpoint allows you to retrieve information about an endpoint in the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoint getMeetingEndpoint(Integer userId, Integer numericMeetingId, String endpointGuid) throws ApiException {
        ApiResponse<Endpoint> resp = getMeetingEndpointWithHttpInfo(userId, numericMeetingId, endpointGuid);
        return resp.getData();
    }

    /**
     * Get Endpoint Information
     * This endpoint allows you to retrieve information about an endpoint in the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoint> getMeetingEndpointWithHttpInfo(Integer userId, Integer numericMeetingId, String endpointGuid) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingEndpointValidateBeforeCall(userId, numericMeetingId, endpointGuid, null, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Endpoint Information (asynchronously)
     * This endpoint allows you to retrieve information about an endpoint in the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingEndpointAsync(Integer userId, Integer numericMeetingId, String endpointGuid, final ApiCallback<Endpoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingEndpointValidateBeforeCall(userId, numericMeetingId, endpointGuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeetingEndpoints
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingEndpointsCall(Integer userId, Integer numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingEndpointsValidateBeforeCall(Integer userId, Integer numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeetingEndpoints(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling getMeetingEndpoints(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingEndpointsCall(userId, numericMeetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Meeting Endpoints
     * This endpoint returns an array of all endpoints in the current meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @return Endpoints
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoints getMeetingEndpoints(Integer userId, Integer numericMeetingId) throws ApiException {
        ApiResponse<Endpoints> resp = getMeetingEndpointsWithHttpInfo(userId, numericMeetingId);
        return resp.getData();
    }

    /**
     * List Meeting Endpoints
     * This endpoint returns an array of all endpoints in the current meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @return ApiResponse&lt;Endpoints&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoints> getMeetingEndpointsWithHttpInfo(Integer userId, Integer numericMeetingId) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingEndpointsValidateBeforeCall(userId, numericMeetingId, null, null);
        Type localVarReturnType = new TypeToken<Endpoints>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Meeting Endpoints (asynchronously)
     * This endpoint returns an array of all endpoints in the current meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingEndpointsAsync(Integer userId, Integer numericMeetingId, final ApiCallback<Endpoints> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingEndpointsValidateBeforeCall(userId, numericMeetingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoints>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeetingNumbers
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingNumbersCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/meetings/{meeting_id}/numbers"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "meeting_id" + "\\}", apiClient.escapeString(meetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingNumbersValidateBeforeCall(Integer userId, Integer meetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeetingNumbers(Async)");
        }
        
        // verify the required parameter 'meetingId' is set
        if (meetingId == null) {
            throw new ApiException("Missing the required parameter 'meetingId' when calling getMeetingNumbers(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingNumbersCall(userId, meetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Meeting Join Info
     * This endpoint retrieves the join information for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @return Numbers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Numbers getMeetingNumbers(Integer userId, Integer meetingId) throws ApiException {
        ApiResponse<Numbers> resp = getMeetingNumbersWithHttpInfo(userId, meetingId);
        return resp.getData();
    }

    /**
     * Get Meeting Join Info
     * This endpoint retrieves the join information for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @return ApiResponse&lt;Numbers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Numbers> getMeetingNumbersWithHttpInfo(Integer userId, Integer meetingId) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingNumbersValidateBeforeCall(userId, meetingId, null, null);
        Type localVarReturnType = new TypeToken<Numbers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Meeting Join Info (asynchronously)
     * This endpoint retrieves the join information for a scheduled meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingNumbersAsync(Integer userId, Integer meetingId, final ApiCallback<Numbers> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingNumbersValidateBeforeCall(userId, meetingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Numbers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMeetingState
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMeetingStateCall(Integer userId, Integer numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMeetingStateValidateBeforeCall(Integer userId, Integer numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMeetingState(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling getMeetingState(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMeetingStateCall(userId, numericMeetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Meeting State
     * This endpoint’s purpose is to return whether the meeting is in progress or not.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @return MeetingState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MeetingState getMeetingState(Integer userId, Integer numericMeetingId) throws ApiException {
        ApiResponse<MeetingState> resp = getMeetingStateWithHttpInfo(userId, numericMeetingId);
        return resp.getData();
    }

    /**
     * Get Meeting State
     * This endpoint’s purpose is to return whether the meeting is in progress or not.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @return ApiResponse&lt;MeetingState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MeetingState> getMeetingStateWithHttpInfo(Integer userId, Integer numericMeetingId) throws ApiException {
        com.squareup.okhttp.Call call = getMeetingStateValidateBeforeCall(userId, numericMeetingId, null, null);
        Type localVarReturnType = new TypeToken<MeetingState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Meeting State (asynchronously)
     * This endpoint’s purpose is to return whether the meeting is in progress or not.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMeetingStateAsync(Integer userId, Integer numericMeetingId, final ApiCallback<MeetingState> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMeetingStateValidateBeforeCall(userId, numericMeetingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MeetingState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMeetings
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId Filter the results by the meeting ID that participants will see and use to join the conference. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMeetingsCall(Integer userId, String numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (numericMeetingId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "numericMeetingId", numericMeetingId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listMeetingsValidateBeforeCall(Integer userId, String numericMeetingId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling listMeetings(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listMeetingsCall(userId, numericMeetingId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Meetings
     * This endpoint gets a list of the user&#39;s scheduled upcoming meetings.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId Filter the results by the meeting ID that participants will see and use to join the conference. (optional)
     * @return List&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Meeting> listMeetings(Integer userId, String numericMeetingId) throws ApiException {
        ApiResponse<List<Meeting>> resp = listMeetingsWithHttpInfo(userId, numericMeetingId);
        return resp.getData();
    }

    /**
     * List Meetings
     * This endpoint gets a list of the user&#39;s scheduled upcoming meetings.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId Filter the results by the meeting ID that participants will see and use to join the conference. (optional)
     * @return ApiResponse&lt;List&lt;Meeting&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Meeting>> listMeetingsWithHttpInfo(Integer userId, String numericMeetingId) throws ApiException {
        com.squareup.okhttp.Call call = listMeetingsValidateBeforeCall(userId, numericMeetingId, null, null);
        Type localVarReturnType = new TypeToken<List<Meeting>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Meetings (asynchronously)
     * This endpoint gets a list of the user&#39;s scheduled upcoming meetings.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId Filter the results by the meeting ID that participants will see and use to join the conference. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMeetingsAsync(Integer userId, String numericMeetingId, final ApiCallback<List<Meeting>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listMeetingsValidateBeforeCall(userId, numericMeetingId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Meeting>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sendMeetingInvite
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadInvite  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sendMeetingInviteCall(Integer userId, Integer numericMeetingId, PayloadInvite payloadInvite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadInvite;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/invite"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendMeetingInviteValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadInvite payloadInvite, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling sendMeetingInvite(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling sendMeetingInvite(Async)");
        }
        
        // verify the required parameter 'payloadInvite' is set
        if (payloadInvite == null) {
            throw new ApiException("Missing the required parameter 'payloadInvite' when calling sendMeetingInvite(Async)");
        }
        
        
        com.squareup.okhttp.Call call = sendMeetingInviteCall(userId, numericMeetingId, payloadInvite, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send Email Invite
     * This endpoint generates an email invite to the specified meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadInvite  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void sendMeetingInvite(Integer userId, Integer numericMeetingId, PayloadInvite payloadInvite) throws ApiException {
        sendMeetingInviteWithHttpInfo(userId, numericMeetingId, payloadInvite);
    }

    /**
     * Send Email Invite
     * This endpoint generates an email invite to the specified meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadInvite  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> sendMeetingInviteWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadInvite payloadInvite) throws ApiException {
        com.squareup.okhttp.Call call = sendMeetingInviteValidateBeforeCall(userId, numericMeetingId, payloadInvite, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send Email Invite (asynchronously)
     * This endpoint generates an email invite to the specified meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadInvite  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendMeetingInviteAsync(Integer userId, Integer numericMeetingId, PayloadInvite payloadInvite, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sendMeetingInviteValidateBeforeCall(userId, numericMeetingId, payloadInvite, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateEndpointLayout
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param isLeader  (optional)
     * @param push  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateEndpointLayoutCall(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean isLeader, Boolean push, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}/layout"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()))
            .replaceAll("\\{" + "endpoint_guid" + "\\}", apiClient.escapeString(endpointGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (isLeader != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isLeader", isLeader));
        if (push != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "push", push));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateEndpointLayoutValidateBeforeCall(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean isLeader, Boolean push, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateEndpointLayout(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling updateEndpointLayout(Async)");
        }
        
        // verify the required parameter 'endpointGuid' is set
        if (endpointGuid == null) {
            throw new ApiException("Missing the required parameter 'endpointGuid' when calling updateEndpointLayout(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateEndpointLayoutCall(userId, numericMeetingId, endpointGuid, isLeader, push, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Endpoint Layout
     * This endpoint allows you to update an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param isLeader  (optional)
     * @param push  (optional)
     * @return Layout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Layout updateEndpointLayout(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean isLeader, Boolean push) throws ApiException {
        ApiResponse<Layout> resp = updateEndpointLayoutWithHttpInfo(userId, numericMeetingId, endpointGuid, isLeader, push);
        return resp.getData();
    }

    /**
     * Update Endpoint Layout
     * This endpoint allows you to update an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param isLeader  (optional)
     * @param push  (optional)
     * @return ApiResponse&lt;Layout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Layout> updateEndpointLayoutWithHttpInfo(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean isLeader, Boolean push) throws ApiException {
        com.squareup.okhttp.Call call = updateEndpointLayoutValidateBeforeCall(userId, numericMeetingId, endpointGuid, isLeader, push, null, null);
        Type localVarReturnType = new TypeToken<Layout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Endpoint Layout (asynchronously)
     * This endpoint allows you to update an individual endpoint’s current layout setting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param isLeader  (optional)
     * @param push  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateEndpointLayoutAsync(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean isLeader, Boolean push, final ApiCallback<Layout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateEndpointLayoutValidateBeforeCall(userId, numericMeetingId, endpointGuid, isLeader, push, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Layout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMeeting
     * @param userId The ID of the user of interest.  This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param meeting The user&#39;s room details that you wish to update. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMeetingCall(Integer userId, Integer meetingId, Meeting meeting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = meeting;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/scheduled_meeting/{meeting_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "meeting_id" + "\\}", apiClient.escapeString(meetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMeetingValidateBeforeCall(Integer userId, Integer meetingId, Meeting meeting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateMeeting(Async)");
        }
        
        // verify the required parameter 'meetingId' is set
        if (meetingId == null) {
            throw new ApiException("Missing the required parameter 'meetingId' when calling updateMeeting(Async)");
        }
        
        // verify the required parameter 'meeting' is set
        if (meeting == null) {
            throw new ApiException("Missing the required parameter 'meeting' when calling updateMeeting(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateMeetingCall(userId, meetingId, meeting, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Meeting
     * This endpoint changes the settings for a user&#39;s meeting. For example, use for rescheduling.
     * @param userId The ID of the user of interest.  This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param meeting The user&#39;s room details that you wish to update. (required)
     * @return Meeting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Meeting updateMeeting(Integer userId, Integer meetingId, Meeting meeting) throws ApiException {
        ApiResponse<Meeting> resp = updateMeetingWithHttpInfo(userId, meetingId, meeting);
        return resp.getData();
    }

    /**
     * Update Meeting
     * This endpoint changes the settings for a user&#39;s meeting. For example, use for rescheduling.
     * @param userId The ID of the user of interest.  This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param meeting The user&#39;s room details that you wish to update. (required)
     * @return ApiResponse&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Meeting> updateMeetingWithHttpInfo(Integer userId, Integer meetingId, Meeting meeting) throws ApiException {
        com.squareup.okhttp.Call call = updateMeetingValidateBeforeCall(userId, meetingId, meeting, null, null);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Meeting (asynchronously)
     * This endpoint changes the settings for a user&#39;s meeting. For example, use for rescheduling.
     * @param userId The ID of the user of interest.  This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param meetingId The ID of the meeting you want to view. This is an integer value. You can find this ID by doing a list of meetings and referencing the \&quot;id\&quot; property. (required)
     * @param meeting The user&#39;s room details that you wish to update. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMeetingAsync(Integer userId, Integer meetingId, Meeting meeting, final ApiCallback<Meeting> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateMeetingValidateBeforeCall(userId, meetingId, meeting, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMeetingEndpoint
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param muteAudio Toggle the audio source mute. (optional)
     * @param muteVideo Toggle the video source mute. (optional)
     * @param leaveMeeting Remove the user from the meeting. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMeetingEndpointCall(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean muteAudio, Boolean muteVideo, Boolean leaveMeeting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints/{endpoint_guid}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()))
            .replaceAll("\\{" + "endpoint_guid" + "\\}", apiClient.escapeString(endpointGuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (muteAudio != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "muteAudio", muteAudio));
        if (muteVideo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "muteVideo", muteVideo));
        if (leaveMeeting != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "leaveMeeting", leaveMeeting));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMeetingEndpointValidateBeforeCall(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean muteAudio, Boolean muteVideo, Boolean leaveMeeting, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateMeetingEndpoint(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling updateMeetingEndpoint(Async)");
        }
        
        // verify the required parameter 'endpointGuid' is set
        if (endpointGuid == null) {
            throw new ApiException("Missing the required parameter 'endpointGuid' when calling updateMeetingEndpoint(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateMeetingEndpointCall(userId, numericMeetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Endpoint Video/Audio State
     * This endpoint allows you to update an individual endpoint’s ability to send audio or video, and also allows removing an endpoint from the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param muteAudio Toggle the audio source mute. (optional)
     * @param muteVideo Toggle the video source mute. (optional)
     * @param leaveMeeting Remove the user from the meeting. (optional)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoint updateMeetingEndpoint(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean muteAudio, Boolean muteVideo, Boolean leaveMeeting) throws ApiException {
        ApiResponse<Endpoint> resp = updateMeetingEndpointWithHttpInfo(userId, numericMeetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting);
        return resp.getData();
    }

    /**
     * Update Endpoint Video/Audio State
     * This endpoint allows you to update an individual endpoint’s ability to send audio or video, and also allows removing an endpoint from the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param muteAudio Toggle the audio source mute. (optional)
     * @param muteVideo Toggle the video source mute. (optional)
     * @param leaveMeeting Remove the user from the meeting. (optional)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoint> updateMeetingEndpointWithHttpInfo(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean muteAudio, Boolean muteVideo, Boolean leaveMeeting) throws ApiException {
        com.squareup.okhttp.Call call = updateMeetingEndpointValidateBeforeCall(userId, numericMeetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting, null, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Endpoint Video/Audio State (asynchronously)
     * This endpoint allows you to update an individual endpoint’s ability to send audio or video, and also allows removing an endpoint from the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param endpointGuid The GUID of an endpoint.  Usually retrieved from the List Meeting Endpoints endpoint. (required)
     * @param muteAudio Toggle the audio source mute. (optional)
     * @param muteVideo Toggle the video source mute. (optional)
     * @param leaveMeeting Remove the user from the meeting. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMeetingEndpointAsync(Integer userId, Integer numericMeetingId, String endpointGuid, Boolean muteAudio, Boolean muteVideo, Boolean leaveMeeting, final ApiCallback<Endpoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateMeetingEndpointValidateBeforeCall(userId, numericMeetingId, endpointGuid, muteAudio, muteVideo, leaveMeeting, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateMeetingEndpoints
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param mute Allows you to mute/unmute all participants in a meeting. Set mute to true to mute.  Set mute to false to unmute. (optional)
     * @param media Specify the type of media you which to mute/unmute. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMeetingEndpointsCall(Integer userId, Integer numericMeetingId, Boolean mute, String media, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}/endpoints"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (mute != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mute", mute));
        if (media != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "media", media));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMeetingEndpointsValidateBeforeCall(Integer userId, Integer numericMeetingId, Boolean mute, String media, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateMeetingEndpoints(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling updateMeetingEndpoints(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateMeetingEndpointsCall(userId, numericMeetingId, mute, media, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Meeting Endpoints State
     * This endpoint’s purpose is to be able to modify the endpoints in a meeting. Seems to require a Meeting-level access token.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param mute Allows you to mute/unmute all participants in a meeting. Set mute to true to mute.  Set mute to false to unmute. (optional)
     * @param media Specify the type of media you which to mute/unmute. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateMeetingEndpoints(Integer userId, Integer numericMeetingId, Boolean mute, String media) throws ApiException {
        updateMeetingEndpointsWithHttpInfo(userId, numericMeetingId, mute, media);
    }

    /**
     * Update Meeting Endpoints State
     * This endpoint’s purpose is to be able to modify the endpoints in a meeting. Seems to require a Meeting-level access token.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param mute Allows you to mute/unmute all participants in a meeting. Set mute to true to mute.  Set mute to false to unmute. (optional)
     * @param media Specify the type of media you which to mute/unmute. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateMeetingEndpointsWithHttpInfo(Integer userId, Integer numericMeetingId, Boolean mute, String media) throws ApiException {
        com.squareup.okhttp.Call call = updateMeetingEndpointsValidateBeforeCall(userId, numericMeetingId, mute, media, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update Meeting Endpoints State (asynchronously)
     * This endpoint’s purpose is to be able to modify the endpoints in a meeting. Seems to require a Meeting-level access token.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param mute Allows you to mute/unmute all participants in a meeting. Set mute to true to mute.  Set mute to false to unmute. (optional)
     * @param media Specify the type of media you which to mute/unmute. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMeetingEndpointsAsync(Integer userId, Integer numericMeetingId, Boolean mute, String media, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateMeetingEndpointsValidateBeforeCall(userId, numericMeetingId, mute, media, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateMeetingState
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadMeetingState The meeting properties that you wish to update. (required)
     * @param delay Number of seconds to delay the end meeting operation. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateMeetingStateCall(Integer userId, Integer numericMeetingId, PayloadMeetingState payloadMeetingState, Integer delay, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = payloadMeetingState;
        
        // create path and map variables
        String localVarPath = "/v1/user/{user_id}/live_meetings/{numeric_meeting_id}"
            .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "numeric_meeting_id" + "\\}", apiClient.escapeString(numericMeetingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (delay != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "delay", delay));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateMeetingStateValidateBeforeCall(Integer userId, Integer numericMeetingId, PayloadMeetingState payloadMeetingState, Integer delay, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateMeetingState(Async)");
        }
        
        // verify the required parameter 'numericMeetingId' is set
        if (numericMeetingId == null) {
            throw new ApiException("Missing the required parameter 'numericMeetingId' when calling updateMeetingState(Async)");
        }
        
        // verify the required parameter 'payloadMeetingState' is set
        if (payloadMeetingState == null) {
            throw new ApiException("Missing the required parameter 'payloadMeetingState' when calling updateMeetingState(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateMeetingStateCall(userId, numericMeetingId, payloadMeetingState, delay, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Meeting State
     * This endpoint’s purpose is to be able to modify a meeting. Actions include locking the meeting, or terminating the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadMeetingState The meeting properties that you wish to update. (required)
     * @param delay Number of seconds to delay the end meeting operation. (optional)
     * @return Meeting
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Meeting updateMeetingState(Integer userId, Integer numericMeetingId, PayloadMeetingState payloadMeetingState, Integer delay) throws ApiException {
        ApiResponse<Meeting> resp = updateMeetingStateWithHttpInfo(userId, numericMeetingId, payloadMeetingState, delay);
        return resp.getData();
    }

    /**
     * Update Meeting State
     * This endpoint’s purpose is to be able to modify a meeting. Actions include locking the meeting, or terminating the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadMeetingState The meeting properties that you wish to update. (required)
     * @param delay Number of seconds to delay the end meeting operation. (optional)
     * @return ApiResponse&lt;Meeting&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Meeting> updateMeetingStateWithHttpInfo(Integer userId, Integer numericMeetingId, PayloadMeetingState payloadMeetingState, Integer delay) throws ApiException {
        com.squareup.okhttp.Call call = updateMeetingStateValidateBeforeCall(userId, numericMeetingId, payloadMeetingState, delay, null, null);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Meeting State (asynchronously)
     * This endpoint’s purpose is to be able to modify a meeting. Actions include locking the meeting, or terminating the meeting.
     * @param userId The ID of the user of interest. This value is an integer which can be retrieved for the current user via the Get User Account Details endpoint. (required)
     * @param numericMeetingId The meeting ID that participants will see and use to join the conference. When joining via phone, this is the code they enter via DTMF to join. (required)
     * @param payloadMeetingState The meeting properties that you wish to update. (required)
     * @param delay Number of seconds to delay the end meeting operation. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMeetingStateAsync(Integer userId, Integer numericMeetingId, PayloadMeetingState payloadMeetingState, Integer delay, final ApiCallback<Meeting> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateMeetingStateValidateBeforeCall(userId, numericMeetingId, payloadMeetingState, delay, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Meeting>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
