/**
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 
 *
 * OpenAPI spec version: 1.0.4407232018
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/RecordingSession'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./RecordingSession'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansMeetingsRestApi) {
      root.BlueJeansMeetingsRestApi = {};
    }
    root.BlueJeansMeetingsRestApi.RecordingHistory = factory(root.BlueJeansMeetingsRestApi.ApiClient, root.BlueJeansMeetingsRestApi.RecordingSession);
  }
}(this, function(ApiClient, RecordingSession) {
  'use strict';




  /**
   * The RecordingHistory model module.
   * @module model/RecordingHistory
   * @version 1.0.4407232018
   */

  /**
   * Constructs a new <code>RecordingHistory</code>.
   * @alias module:model/RecordingHistory
   * @class
   */
  var exports = function() {
    var _this = this;












  };

  /**
   * Constructs a <code>RecordingHistory</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RecordingHistory} obj Optional instance to populate.
   * @return {module:model/RecordingHistory} The populated <code>RecordingHistory</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('chapterId')) {
        obj['chapterId'] = ApiClient.convertToType(data['chapterId'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('startTimeOffset')) {
        obj['startTimeOffset'] = ApiClient.convertToType(data['startTimeOffset'], 'Number');
      }
      if (data.hasOwnProperty('endTimeOffset')) {
        obj['endTimeOffset'] = ApiClient.convertToType(data['endTimeOffset'], 'Number');
      }
      if (data.hasOwnProperty('chapterName')) {
        obj['chapterName'] = ApiClient.convertToType(data['chapterName'], 'String');
      }
      if (data.hasOwnProperty('totalSize')) {
        obj['totalSize'] = ApiClient.convertToType(data['totalSize'], 'Number');
      }
      if (data.hasOwnProperty('compositeContentId')) {
        obj['compositeContentId'] = ApiClient.convertToType(data['compositeContentId'], 'Number');
      }
      if (data.hasOwnProperty('compositeContentStatus')) {
        obj['compositeContentStatus'] = ApiClient.convertToType(data['compositeContentStatus'], 'String');
      }
      if (data.hasOwnProperty('parentRecordingId')) {
        obj['parentRecordingId'] = ApiClient.convertToType(data['parentRecordingId'], 'Number');
      }
      if (data.hasOwnProperty('viewCount')) {
        obj['viewCount'] = ApiClient.convertToType(data['viewCount'], 'Number');
      }
      if (data.hasOwnProperty('recordingSessions')) {
        obj['recordingSessions'] = ApiClient.convertToType(data['recordingSessions'], [RecordingSession]);
      }
    }
    return obj;
  }

  /**
   * @member {String} chapterId
   */
  exports.prototype['chapterId'] = undefined;
  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Number} startTimeOffset
   */
  exports.prototype['startTimeOffset'] = undefined;
  /**
   * @member {Number} endTimeOffset
   */
  exports.prototype['endTimeOffset'] = undefined;
  /**
   * @member {String} chapterName
   */
  exports.prototype['chapterName'] = undefined;
  /**
   * @member {Number} totalSize
   */
  exports.prototype['totalSize'] = undefined;
  /**
   * @member {Number} compositeContentId
   */
  exports.prototype['compositeContentId'] = undefined;
  /**
   * @member {module:model/RecordingHistory.CompositeContentStatusEnum} compositeContentStatus
   */
  exports.prototype['compositeContentStatus'] = undefined;
  /**
   * @member {Number} parentRecordingId
   */
  exports.prototype['parentRecordingId'] = undefined;
  /**
   * @member {Number} viewCount
   */
  exports.prototype['viewCount'] = undefined;
  /**
   * @member {Array.<module:model/RecordingSession>} recordingSessions
   */
  exports.prototype['recordingSessions'] = undefined;


  /**
   * Allowed values for the <code>compositeContentStatus</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CompositeContentStatusEnum = {
    /**
     * value: "PROCESSED"
     * @const
     */
    "PROCESSED": "PROCESSED"  };


  return exports;
}));


