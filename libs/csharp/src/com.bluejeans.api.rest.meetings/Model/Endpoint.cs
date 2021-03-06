/* 
 * BlueJeans Meetings REST API
 *
 *  ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.    <alert>7/23/2018 </alert>Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by a randomized access code.  THe access code ensures security of participants who join.  Also the access code can specify a Moderator role whose user(s) have additional capabilities to administer a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>The scheduler's profile has a user-specified moderator passcode which can be input to allow designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About Meetings Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr> 
 *
 * OpenAPI spec version: 1.0.4407232018
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = com.bluejeans.api.rest.meetings.Client.SwaggerDateConverter;

namespace com.bluejeans.api.rest.meetings.Model
{
    /// <summary>
    /// Endpoint
    /// </summary>
    [DataContract]
    public partial class Endpoint :  IEquatable<Endpoint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Endpoint" /> class.
        /// </summary>
        /// <param name="ecMode">ecMode.</param>
        /// <param name="creationtime">creationtime.</param>
        /// <param name="audioRemoteRtcpAddress">audioRemoteRtcpAddress.</param>
        /// <param name="videoSendCodec">videoSendCodec.</param>
        /// <param name="audioPlayID">audioPlayID.</param>
        /// <param name="callQualityRecv">callQualityRecv.</param>
        /// <param name="sessionOut">sessionOut.</param>
        /// <param name="audioLocalAddress">audioLocalAddress.</param>
        /// <param name="meetingid">meetingid.</param>
        /// <param name="videoSendWidth">videoSendWidth.</param>
        /// <param name="callQualitySend">callQualitySend.</param>
        /// <param name="mhaddress">mhaddress.</param>
        /// <param name="rDCControlleeCapable">rDCControlleeCapable.</param>
        /// <param name="audioCapName">audioCapName.</param>
        /// <param name="proxyInfo">proxyInfo.</param>
        /// <param name="audioSendCodec">audioSendCodec.</param>
        /// <param name="vendor">vendor.</param>
        /// <param name="videoRecvWidth">videoRecvWidth.</param>
        /// <param name="conaddress">conaddress.</param>
        /// <param name="talkDetected">talkDetected.</param>
        /// <param name="subLayout">subLayout.</param>
        /// <param name="audioRtcpRelay">audioRtcpRelay.</param>
        /// <param name="audioRecvLocalMute">audioRecvLocalMute.</param>
        /// <param name="name">name.</param>
        /// <param name="videoLocalAddress">videoLocalAddress.</param>
        /// <param name="audioLocalRtcpAddress">audioLocalRtcpAddress.</param>
        /// <param name="contentRtpRelay">contentRtpRelay.</param>
        /// <param name="contentLocalRtcpAddress">contentLocalRtcpAddress.</param>
        /// <param name="remoteConnectionCount">remoteConnectionCount.</param>
        /// <param name="callrate">callrate.</param>
        /// <param name="mixerGuid">mixerGuid.</param>
        /// <param name="transport">transport.</param>
        /// <param name="audioCapSelectID">audioCapSelectID.</param>
        /// <param name="countryCode">countryCode.</param>
        /// <param name="rDCControllerCapable">rDCControllerCapable.</param>
        /// <param name="pairedname">pairedname.</param>
        /// <param name="videoRtcpRelay">videoRtcpRelay.</param>
        /// <param name="endpointCpuParams">endpointCpuParams.</param>
        /// <param name="videoRemoteAddress">videoRemoteAddress.</param>
        /// <param name="version">version.</param>
        /// <param name="contentRecv">contentRecv.</param>
        /// <param name="localName">localName.</param>
        /// <param name="bJNUserId">bJNUserId.</param>
        /// <param name="contentRemoteAddress">contentRemoteAddress.</param>
        /// <param name="audioSend">audioSend.</param>
        /// <param name="participantDTMFMenus">participantDTMFMenus.</param>
        /// <param name="videoRtcpTranspor">videoRtcpTranspor.</param>
        /// <param name="audioRtcpTransport">audioRtcpTransport.</param>
        /// <param name="relayNodeId">relayNodeId.</param>
        /// <param name="contentRemoteRtcpAddress">contentRemoteRtcpAddress.</param>
        /// <param name="audioRtpRelay">audioRtpRelay.</param>
        /// <param name="videoRtpTransport">videoRtpTransport.</param>
        /// <param name="contentRecvLocalMute">contentRecvLocalMute.</param>
        /// <param name="layout">layout.</param>
        /// <param name="contentSend">contentSend.</param>
        /// <param name="remoteaddress">remoteaddress.</param>
        /// <param name="meetingGuid">meetingGuid.</param>
        /// <param name="connecttime">connecttime.</param>
        /// <param name="localaddress">localaddress.</param>
        /// <param name="audioRemoteAddress">audioRemoteAddress.</param>
        /// <param name="bondedAudioGuid">bondedAudioGuid.</param>
        /// <param name="audioRecvRemoteMute">audioRecvRemoteMute.</param>
        /// <param name="sessionOutRelay">sessionOutRelay.</param>
        /// <param name="leader">leader.</param>
        /// <param name="contentLocalAddress">contentLocalAddress.</param>
        /// <param name="movieCapable">movieCapable.</param>
        /// <param name="videoRecvLocalMute">videoRecvLocalMute.</param>
        /// <param name="contentRtpTransport">contentRtpTransport.</param>
        /// <param name="rDCVersion">rDCVersion.</param>
        /// <param name="audioRecv">audioRecv.</param>
        /// <param name="contentRelayServer">contentRelayServer.</param>
        /// <param name="videoRecv">videoRecv.</param>
        /// <param name="visibility">visibility.</param>
        /// <param name="sessionid">sessionid.</param>
        /// <param name="contentRtcpRelay">contentRtcpRelay.</param>
        /// <param name="locales">locales.</param>
        /// <param name="medaddress">medaddress.</param>
        /// <param name="htmlLayoutGuid">htmlLayoutGuid.</param>
        /// <param name="endpoint">endpoint.</param>
        /// <param name="videoDrop">videoDrop.</param>
        /// <param name="contentRtcpTransport">contentRtcpTransport.</param>
        /// <param name="videoRemoteRtcpAddress">videoRemoteRtcpAddress.</param>
        /// <param name="videoRtpRelay">videoRtpRelay.</param>
        /// <param name="mixaddress">mixaddress.</param>
        /// <param name="sIPHTTPProxyTransport">sIPHTTPProxyTransport.</param>
        /// <param name="videoRecvCodec">videoRecvCodec.</param>
        /// <param name="audioRecvCodec">audioRecvCodec.</param>
        /// <param name="sessionIn">sessionIn.</param>
        /// <param name="bondedVideoGuid">bondedVideoGuid.</param>
        /// <param name="callQuality">callQuality.</param>
        /// <param name="meetingjointime">meetingjointime.</param>
        /// <param name="sessionInRelay">sessionInRelay.</param>
        /// <param name="pairedremoteaddress">pairedremoteaddress.</param>
        /// <param name="videoSendHeight">videoSendHeight.</param>
        /// <param name="videoRecvHeight">videoRecvHeight.</param>
        /// <param name="secureCall">secureCall.</param>
        /// <param name="videoLocalRtcpAddress">videoLocalRtcpAddress.</param>
        /// <param name="audioPlayName">audioPlayName.</param>
        /// <param name="videoCapID">videoCapID.</param>
        /// <param name="audioRtpTransport">audioRtpTransport.</param>
        /// <param name="meetingInfoMode">meetingInfoMode.</param>
        /// <param name="callhostname">callhostname.</param>
        /// <param name="callguid">callguid.</param>
        /// <param name="audioCapID">audioCapID.</param>
        /// <param name="videoSend">videoSend.</param>
        /// <param name="contentRecvCodec">contentRecvCodec.</param>
        /// <param name="sessionRelay">sessionRelay.</param>
        /// <param name="videoRecvRemoteMute">videoRecvRemoteMute.</param>
        /// <param name="id">id.</param>
        /// <param name="bondedVideoName">bondedVideoName.</param>
        /// <param name="isInRoster">isInRoster.</param>
        public Endpoint(string ecMode = default(string), string creationtime = default(string), string audioRemoteRtcpAddress = default(string), string videoSendCodec = default(string), string audioPlayID = default(string), string callQualityRecv = default(string), string sessionOut = default(string), string audioLocalAddress = default(string), string meetingid = default(string), string videoSendWidth = default(string), string callQualitySend = default(string), string mhaddress = default(string), string rDCControlleeCapable = default(string), string audioCapName = default(string), string proxyInfo = default(string), string audioSendCodec = default(string), string vendor = default(string), string videoRecvWidth = default(string), string conaddress = default(string), string talkDetected = default(string), string subLayout = default(string), string audioRtcpRelay = default(string), string audioRecvLocalMute = default(string), string name = default(string), string videoLocalAddress = default(string), string audioLocalRtcpAddress = default(string), string contentRtpRelay = default(string), string contentLocalRtcpAddress = default(string), string remoteConnectionCount = default(string), string callrate = default(string), string mixerGuid = default(string), string transport = default(string), string audioCapSelectID = default(string), string countryCode = default(string), string rDCControllerCapable = default(string), string pairedname = default(string), string videoRtcpRelay = default(string), string endpointCpuParams = default(string), string videoRemoteAddress = default(string), string version = default(string), string contentRecv = default(string), string localName = default(string), string bJNUserId = default(string), string contentRemoteAddress = default(string), string audioSend = default(string), string participantDTMFMenus = default(string), string videoRtcpTranspor = default(string), string audioRtcpTransport = default(string), string relayNodeId = default(string), string contentRemoteRtcpAddress = default(string), string audioRtpRelay = default(string), string videoRtpTransport = default(string), string contentRecvLocalMute = default(string), string layout = default(string), string contentSend = default(string), string remoteaddress = default(string), string meetingGuid = default(string), string connecttime = default(string), string localaddress = default(string), string audioRemoteAddress = default(string), string bondedAudioGuid = default(string), string audioRecvRemoteMute = default(string), string sessionOutRelay = default(string), string leader = default(string), string contentLocalAddress = default(string), string movieCapable = default(string), string videoRecvLocalMute = default(string), string contentRtpTransport = default(string), string rDCVersion = default(string), string audioRecv = default(string), string contentRelayServer = default(string), string videoRecv = default(string), string visibility = default(string), string sessionid = default(string), string contentRtcpRelay = default(string), string locales = default(string), string medaddress = default(string), string htmlLayoutGuid = default(string), string endpoint = default(string), string videoDrop = default(string), string contentRtcpTransport = default(string), string videoRemoteRtcpAddress = default(string), string videoRtpRelay = default(string), string mixaddress = default(string), string sIPHTTPProxyTransport = default(string), string videoRecvCodec = default(string), string audioRecvCodec = default(string), string sessionIn = default(string), string bondedVideoGuid = default(string), string callQuality = default(string), string meetingjointime = default(string), string sessionInRelay = default(string), string pairedremoteaddress = default(string), string videoSendHeight = default(string), string videoRecvHeight = default(string), string secureCall = default(string), string videoLocalRtcpAddress = default(string), string audioPlayName = default(string), string videoCapID = default(string), string audioRtpTransport = default(string), string meetingInfoMode = default(string), string callhostname = default(string), string callguid = default(string), string audioCapID = default(string), string videoSend = default(string), string contentRecvCodec = default(string), string sessionRelay = default(string), string videoRecvRemoteMute = default(string), string id = default(string), string bondedVideoName = default(string), bool? isInRoster = default(bool?))
        {
            this.EcMode = ecMode;
            this.Creationtime = creationtime;
            this.AudioRemoteRtcpAddress = audioRemoteRtcpAddress;
            this.VideoSendCodec = videoSendCodec;
            this.AudioPlayID = audioPlayID;
            this.CallQualityRecv = callQualityRecv;
            this.SessionOut = sessionOut;
            this.AudioLocalAddress = audioLocalAddress;
            this.Meetingid = meetingid;
            this.VideoSendWidth = videoSendWidth;
            this.CallQualitySend = callQualitySend;
            this.Mhaddress = mhaddress;
            this.RDCControlleeCapable = rDCControlleeCapable;
            this.AudioCapName = audioCapName;
            this.ProxyInfo = proxyInfo;
            this.AudioSendCodec = audioSendCodec;
            this.Vendor = vendor;
            this.VideoRecvWidth = videoRecvWidth;
            this.Conaddress = conaddress;
            this.TalkDetected = talkDetected;
            this.SubLayout = subLayout;
            this.AudioRtcpRelay = audioRtcpRelay;
            this.AudioRecvLocalMute = audioRecvLocalMute;
            this.Name = name;
            this.VideoLocalAddress = videoLocalAddress;
            this.AudioLocalRtcpAddress = audioLocalRtcpAddress;
            this.ContentRtpRelay = contentRtpRelay;
            this.ContentLocalRtcpAddress = contentLocalRtcpAddress;
            this.RemoteConnectionCount = remoteConnectionCount;
            this.Callrate = callrate;
            this.MixerGuid = mixerGuid;
            this.Transport = transport;
            this.AudioCapSelectID = audioCapSelectID;
            this.CountryCode = countryCode;
            this.RDCControllerCapable = rDCControllerCapable;
            this.Pairedname = pairedname;
            this.VideoRtcpRelay = videoRtcpRelay;
            this.EndpointCpuParams = endpointCpuParams;
            this.VideoRemoteAddress = videoRemoteAddress;
            this.Version = version;
            this.ContentRecv = contentRecv;
            this.LocalName = localName;
            this.BJNUserId = bJNUserId;
            this.ContentRemoteAddress = contentRemoteAddress;
            this.AudioSend = audioSend;
            this.ParticipantDTMFMenus = participantDTMFMenus;
            this.VideoRtcpTranspor = videoRtcpTranspor;
            this.AudioRtcpTransport = audioRtcpTransport;
            this.RelayNodeId = relayNodeId;
            this.ContentRemoteRtcpAddress = contentRemoteRtcpAddress;
            this.AudioRtpRelay = audioRtpRelay;
            this.VideoRtpTransport = videoRtpTransport;
            this.ContentRecvLocalMute = contentRecvLocalMute;
            this.Layout = layout;
            this.ContentSend = contentSend;
            this.Remoteaddress = remoteaddress;
            this.MeetingGuid = meetingGuid;
            this.Connecttime = connecttime;
            this.Localaddress = localaddress;
            this.AudioRemoteAddress = audioRemoteAddress;
            this.BondedAudioGuid = bondedAudioGuid;
            this.AudioRecvRemoteMute = audioRecvRemoteMute;
            this.SessionOutRelay = sessionOutRelay;
            this.Leader = leader;
            this.ContentLocalAddress = contentLocalAddress;
            this.MovieCapable = movieCapable;
            this.VideoRecvLocalMute = videoRecvLocalMute;
            this.ContentRtpTransport = contentRtpTransport;
            this.RDCVersion = rDCVersion;
            this.AudioRecv = audioRecv;
            this.ContentRelayServer = contentRelayServer;
            this.VideoRecv = videoRecv;
            this.Visibility = visibility;
            this.Sessionid = sessionid;
            this.ContentRtcpRelay = contentRtcpRelay;
            this.Locales = locales;
            this.Medaddress = medaddress;
            this.HtmlLayoutGuid = htmlLayoutGuid;
            this._Endpoint = endpoint;
            this.VideoDrop = videoDrop;
            this.ContentRtcpTransport = contentRtcpTransport;
            this.VideoRemoteRtcpAddress = videoRemoteRtcpAddress;
            this.VideoRtpRelay = videoRtpRelay;
            this.Mixaddress = mixaddress;
            this.SIPHTTPProxyTransport = sIPHTTPProxyTransport;
            this.VideoRecvCodec = videoRecvCodec;
            this.AudioRecvCodec = audioRecvCodec;
            this.SessionIn = sessionIn;
            this.BondedVideoGuid = bondedVideoGuid;
            this.CallQuality = callQuality;
            this.Meetingjointime = meetingjointime;
            this.SessionInRelay = sessionInRelay;
            this.Pairedremoteaddress = pairedremoteaddress;
            this.VideoSendHeight = videoSendHeight;
            this.VideoRecvHeight = videoRecvHeight;
            this.SecureCall = secureCall;
            this.VideoLocalRtcpAddress = videoLocalRtcpAddress;
            this.AudioPlayName = audioPlayName;
            this.VideoCapID = videoCapID;
            this.AudioRtpTransport = audioRtpTransport;
            this.MeetingInfoMode = meetingInfoMode;
            this.Callhostname = callhostname;
            this.Callguid = callguid;
            this.AudioCapID = audioCapID;
            this.VideoSend = videoSend;
            this.ContentRecvCodec = contentRecvCodec;
            this.SessionRelay = sessionRelay;
            this.VideoRecvRemoteMute = videoRecvRemoteMute;
            this.Id = id;
            this.BondedVideoName = bondedVideoName;
            this.IsInRoster = isInRoster;
        }
        
        /// <summary>
        /// Gets or Sets EcMode
        /// </summary>
        [DataMember(Name="EcMode", EmitDefaultValue=false)]
        public string EcMode { get; set; }

        /// <summary>
        /// Gets or Sets Creationtime
        /// </summary>
        [DataMember(Name="creationtime", EmitDefaultValue=false)]
        public string Creationtime { get; set; }

        /// <summary>
        /// Gets or Sets AudioRemoteRtcpAddress
        /// </summary>
        [DataMember(Name="audio.remote.rtcpAddress", EmitDefaultValue=false)]
        public string AudioRemoteRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendCodec
        /// </summary>
        [DataMember(Name="VideoSendCodec", EmitDefaultValue=false)]
        public string VideoSendCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioPlayID
        /// </summary>
        [DataMember(Name="AudioPlayID", EmitDefaultValue=false)]
        public string AudioPlayID { get; set; }

        /// <summary>
        /// Gets or Sets CallQualityRecv
        /// </summary>
        [DataMember(Name="CallQualityRecv", EmitDefaultValue=false)]
        public string CallQualityRecv { get; set; }

        /// <summary>
        /// Gets or Sets SessionOut
        /// </summary>
        [DataMember(Name="SessionOut", EmitDefaultValue=false)]
        public string SessionOut { get; set; }

        /// <summary>
        /// Gets or Sets AudioLocalAddress
        /// </summary>
        [DataMember(Name="audio.local.address", EmitDefaultValue=false)]
        public string AudioLocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets Meetingid
        /// </summary>
        [DataMember(Name="meetingid", EmitDefaultValue=false)]
        public string Meetingid { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendWidth
        /// </summary>
        [DataMember(Name="VideoSendWidth", EmitDefaultValue=false)]
        public string VideoSendWidth { get; set; }

        /// <summary>
        /// Gets or Sets CallQualitySend
        /// </summary>
        [DataMember(Name="CallQualitySend", EmitDefaultValue=false)]
        public string CallQualitySend { get; set; }

        /// <summary>
        /// Gets or Sets Mhaddress
        /// </summary>
        [DataMember(Name="mhaddress", EmitDefaultValue=false)]
        public string Mhaddress { get; set; }

        /// <summary>
        /// Gets or Sets RDCControlleeCapable
        /// </summary>
        [DataMember(Name="RDCControlleeCapable", EmitDefaultValue=false)]
        public string RDCControlleeCapable { get; set; }

        /// <summary>
        /// Gets or Sets AudioCapName
        /// </summary>
        [DataMember(Name="AudioCapName", EmitDefaultValue=false)]
        public string AudioCapName { get; set; }

        /// <summary>
        /// Gets or Sets ProxyInfo
        /// </summary>
        [DataMember(Name="ProxyInfo", EmitDefaultValue=false)]
        public string ProxyInfo { get; set; }

        /// <summary>
        /// Gets or Sets AudioSendCodec
        /// </summary>
        [DataMember(Name="AudioSendCodec", EmitDefaultValue=false)]
        public string AudioSendCodec { get; set; }

        /// <summary>
        /// Gets or Sets Vendor
        /// </summary>
        [DataMember(Name="vendor", EmitDefaultValue=false)]
        public string Vendor { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvWidth
        /// </summary>
        [DataMember(Name="VideoRecvWidth", EmitDefaultValue=false)]
        public string VideoRecvWidth { get; set; }

        /// <summary>
        /// Gets or Sets Conaddress
        /// </summary>
        [DataMember(Name="conaddress", EmitDefaultValue=false)]
        public string Conaddress { get; set; }

        /// <summary>
        /// Gets or Sets TalkDetected
        /// </summary>
        [DataMember(Name="TalkDetected", EmitDefaultValue=false)]
        public string TalkDetected { get; set; }

        /// <summary>
        /// Gets or Sets SubLayout
        /// </summary>
        [DataMember(Name="SubLayout", EmitDefaultValue=false)]
        public string SubLayout { get; set; }

        /// <summary>
        /// Gets or Sets AudioRtcpRelay
        /// </summary>
        [DataMember(Name="AudioRtcpRelay", EmitDefaultValue=false)]
        public string AudioRtcpRelay { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvLocalMute
        /// </summary>
        [DataMember(Name="AudioRecvLocalMute", EmitDefaultValue=false)]
        public string AudioRecvLocalMute { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets VideoLocalAddress
        /// </summary>
        [DataMember(Name="video.local.address", EmitDefaultValue=false)]
        public string VideoLocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets AudioLocalRtcpAddress
        /// </summary>
        [DataMember(Name="audio.local.rtcpAddress", EmitDefaultValue=false)]
        public string AudioLocalRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets ContentRtpRelay
        /// </summary>
        [DataMember(Name="ContentRtpRelay", EmitDefaultValue=false)]
        public string ContentRtpRelay { get; set; }

        /// <summary>
        /// Gets or Sets ContentLocalRtcpAddress
        /// </summary>
        [DataMember(Name="content.local.rtcpAddress", EmitDefaultValue=false)]
        public string ContentLocalRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets RemoteConnectionCount
        /// </summary>
        [DataMember(Name="RemoteConnectionCount", EmitDefaultValue=false)]
        public string RemoteConnectionCount { get; set; }

        /// <summary>
        /// Gets or Sets Callrate
        /// </summary>
        [DataMember(Name="callrate", EmitDefaultValue=false)]
        public string Callrate { get; set; }

        /// <summary>
        /// Gets or Sets MixerGuid
        /// </summary>
        [DataMember(Name="MixerGuid", EmitDefaultValue=false)]
        public string MixerGuid { get; set; }

        /// <summary>
        /// Gets or Sets Transport
        /// </summary>
        [DataMember(Name="transport", EmitDefaultValue=false)]
        public string Transport { get; set; }

        /// <summary>
        /// Gets or Sets AudioCapSelectID
        /// </summary>
        [DataMember(Name="AudioCapSelectID", EmitDefaultValue=false)]
        public string AudioCapSelectID { get; set; }

        /// <summary>
        /// Gets or Sets CountryCode
        /// </summary>
        [DataMember(Name="CountryCode", EmitDefaultValue=false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Gets or Sets RDCControllerCapable
        /// </summary>
        [DataMember(Name="RDCControllerCapable", EmitDefaultValue=false)]
        public string RDCControllerCapable { get; set; }

        /// <summary>
        /// Gets or Sets Pairedname
        /// </summary>
        [DataMember(Name="pairedname", EmitDefaultValue=false)]
        public string Pairedname { get; set; }

        /// <summary>
        /// Gets or Sets VideoRtcpRelay
        /// </summary>
        [DataMember(Name="VideoRtcpRelay", EmitDefaultValue=false)]
        public string VideoRtcpRelay { get; set; }

        /// <summary>
        /// Gets or Sets EndpointCpuParams
        /// </summary>
        [DataMember(Name="EndpointCpuParams", EmitDefaultValue=false)]
        public string EndpointCpuParams { get; set; }

        /// <summary>
        /// Gets or Sets VideoRemoteAddress
        /// </summary>
        [DataMember(Name="video.remote.address", EmitDefaultValue=false)]
        public string VideoRemoteAddress { get; set; }

        /// <summary>
        /// Gets or Sets Version
        /// </summary>
        [DataMember(Name="version", EmitDefaultValue=false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets ContentRecv
        /// </summary>
        [DataMember(Name="ContentRecv", EmitDefaultValue=false)]
        public string ContentRecv { get; set; }

        /// <summary>
        /// Gets or Sets LocalName
        /// </summary>
        [DataMember(Name="localName", EmitDefaultValue=false)]
        public string LocalName { get; set; }

        /// <summary>
        /// Gets or Sets BJNUserId
        /// </summary>
        [DataMember(Name="BJNUserId", EmitDefaultValue=false)]
        public string BJNUserId { get; set; }

        /// <summary>
        /// Gets or Sets ContentRemoteAddress
        /// </summary>
        [DataMember(Name="content.remote.address", EmitDefaultValue=false)]
        public string ContentRemoteAddress { get; set; }

        /// <summary>
        /// Gets or Sets AudioSend
        /// </summary>
        [DataMember(Name="AudioSend", EmitDefaultValue=false)]
        public string AudioSend { get; set; }

        /// <summary>
        /// Gets or Sets ParticipantDTMFMenus
        /// </summary>
        [DataMember(Name="ParticipantDTMFMenus", EmitDefaultValue=false)]
        public string ParticipantDTMFMenus { get; set; }

        /// <summary>
        /// Gets or Sets VideoRtcpTranspor
        /// </summary>
        [DataMember(Name="VideoRtcpTranspor", EmitDefaultValue=false)]
        public string VideoRtcpTranspor { get; set; }

        /// <summary>
        /// Gets or Sets AudioRtcpTransport
        /// </summary>
        [DataMember(Name="AudioRtcpTransport", EmitDefaultValue=false)]
        public string AudioRtcpTransport { get; set; }

        /// <summary>
        /// Gets or Sets RelayNodeId
        /// </summary>
        [DataMember(Name="RelayNodeId", EmitDefaultValue=false)]
        public string RelayNodeId { get; set; }

        /// <summary>
        /// Gets or Sets ContentRemoteRtcpAddress
        /// </summary>
        [DataMember(Name="content.remote.rtcpAddress", EmitDefaultValue=false)]
        public string ContentRemoteRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets AudioRtpRelay
        /// </summary>
        [DataMember(Name="AudioRtpRelay", EmitDefaultValue=false)]
        public string AudioRtpRelay { get; set; }

        /// <summary>
        /// Gets or Sets VideoRtpTransport
        /// </summary>
        [DataMember(Name="VideoRtpTransport", EmitDefaultValue=false)]
        public string VideoRtpTransport { get; set; }

        /// <summary>
        /// Gets or Sets ContentRecvLocalMute
        /// </summary>
        [DataMember(Name="ContentRecvLocalMute", EmitDefaultValue=false)]
        public string ContentRecvLocalMute { get; set; }

        /// <summary>
        /// Gets or Sets Layout
        /// </summary>
        [DataMember(Name="Layout", EmitDefaultValue=false)]
        public string Layout { get; set; }

        /// <summary>
        /// Gets or Sets ContentSend
        /// </summary>
        [DataMember(Name="ContentSend", EmitDefaultValue=false)]
        public string ContentSend { get; set; }

        /// <summary>
        /// Gets or Sets Remoteaddress
        /// </summary>
        [DataMember(Name="remoteaddress", EmitDefaultValue=false)]
        public string Remoteaddress { get; set; }

        /// <summary>
        /// Gets or Sets MeetingGuid
        /// </summary>
        [DataMember(Name="MeetingGuid", EmitDefaultValue=false)]
        public string MeetingGuid { get; set; }

        /// <summary>
        /// Gets or Sets Connecttime
        /// </summary>
        [DataMember(Name="connecttime", EmitDefaultValue=false)]
        public string Connecttime { get; set; }

        /// <summary>
        /// Gets or Sets Localaddress
        /// </summary>
        [DataMember(Name="localaddress", EmitDefaultValue=false)]
        public string Localaddress { get; set; }

        /// <summary>
        /// Gets or Sets AudioRemoteAddress
        /// </summary>
        [DataMember(Name="audio.remote.address", EmitDefaultValue=false)]
        public string AudioRemoteAddress { get; set; }

        /// <summary>
        /// Gets or Sets BondedAudioGuid
        /// </summary>
        [DataMember(Name="BondedAudioGuid", EmitDefaultValue=false)]
        public string BondedAudioGuid { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvRemoteMute
        /// </summary>
        [DataMember(Name="AudioRecvRemoteMute", EmitDefaultValue=false)]
        public string AudioRecvRemoteMute { get; set; }

        /// <summary>
        /// Gets or Sets SessionOutRelay
        /// </summary>
        [DataMember(Name="SessionOutRelay", EmitDefaultValue=false)]
        public string SessionOutRelay { get; set; }

        /// <summary>
        /// Gets or Sets Leader
        /// </summary>
        [DataMember(Name="Leader", EmitDefaultValue=false)]
        public string Leader { get; set; }

        /// <summary>
        /// Gets or Sets ContentLocalAddress
        /// </summary>
        [DataMember(Name="content.local.address", EmitDefaultValue=false)]
        public string ContentLocalAddress { get; set; }

        /// <summary>
        /// Gets or Sets MovieCapable
        /// </summary>
        [DataMember(Name="MovieCapable", EmitDefaultValue=false)]
        public string MovieCapable { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvLocalMute
        /// </summary>
        [DataMember(Name="VideoRecvLocalMute", EmitDefaultValue=false)]
        public string VideoRecvLocalMute { get; set; }

        /// <summary>
        /// Gets or Sets ContentRtpTransport
        /// </summary>
        [DataMember(Name="ContentRtpTransport", EmitDefaultValue=false)]
        public string ContentRtpTransport { get; set; }

        /// <summary>
        /// Gets or Sets RDCVersion
        /// </summary>
        [DataMember(Name="RDCVersion", EmitDefaultValue=false)]
        public string RDCVersion { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecv
        /// </summary>
        [DataMember(Name="AudioRecv", EmitDefaultValue=false)]
        public string AudioRecv { get; set; }

        /// <summary>
        /// Gets or Sets ContentRelayServer
        /// </summary>
        [DataMember(Name="ContentRelayServer", EmitDefaultValue=false)]
        public string ContentRelayServer { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecv
        /// </summary>
        [DataMember(Name="VideoRecv", EmitDefaultValue=false)]
        public string VideoRecv { get; set; }

        /// <summary>
        /// Gets or Sets Visibility
        /// </summary>
        [DataMember(Name="visibility", EmitDefaultValue=false)]
        public string Visibility { get; set; }

        /// <summary>
        /// Gets or Sets Sessionid
        /// </summary>
        [DataMember(Name="sessionid", EmitDefaultValue=false)]
        public string Sessionid { get; set; }

        /// <summary>
        /// Gets or Sets ContentRtcpRelay
        /// </summary>
        [DataMember(Name="ContentRtcpRelay", EmitDefaultValue=false)]
        public string ContentRtcpRelay { get; set; }

        /// <summary>
        /// Gets or Sets Locales
        /// </summary>
        [DataMember(Name="locales", EmitDefaultValue=false)]
        public string Locales { get; set; }

        /// <summary>
        /// Gets or Sets Medaddress
        /// </summary>
        [DataMember(Name="medaddress", EmitDefaultValue=false)]
        public string Medaddress { get; set; }

        /// <summary>
        /// Gets or Sets HtmlLayoutGuid
        /// </summary>
        [DataMember(Name="HtmlLayoutGuid", EmitDefaultValue=false)]
        public string HtmlLayoutGuid { get; set; }

        /// <summary>
        /// Gets or Sets _Endpoint
        /// </summary>
        [DataMember(Name="endpoint", EmitDefaultValue=false)]
        public string _Endpoint { get; set; }

        /// <summary>
        /// Gets or Sets VideoDrop
        /// </summary>
        [DataMember(Name="VideoDrop", EmitDefaultValue=false)]
        public string VideoDrop { get; set; }

        /// <summary>
        /// Gets or Sets ContentRtcpTransport
        /// </summary>
        [DataMember(Name="ContentRtcpTransport", EmitDefaultValue=false)]
        public string ContentRtcpTransport { get; set; }

        /// <summary>
        /// Gets or Sets VideoRemoteRtcpAddress
        /// </summary>
        [DataMember(Name="video.remote.rtcpAddress", EmitDefaultValue=false)]
        public string VideoRemoteRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets VideoRtpRelay
        /// </summary>
        [DataMember(Name="VideoRtpRelay", EmitDefaultValue=false)]
        public string VideoRtpRelay { get; set; }

        /// <summary>
        /// Gets or Sets Mixaddress
        /// </summary>
        [DataMember(Name="mixaddress", EmitDefaultValue=false)]
        public string Mixaddress { get; set; }

        /// <summary>
        /// Gets or Sets SIPHTTPProxyTransport
        /// </summary>
        [DataMember(Name="SIPHTTPProxyTransport", EmitDefaultValue=false)]
        public string SIPHTTPProxyTransport { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvCodec
        /// </summary>
        [DataMember(Name="VideoRecvCodec", EmitDefaultValue=false)]
        public string VideoRecvCodec { get; set; }

        /// <summary>
        /// Gets or Sets AudioRecvCodec
        /// </summary>
        [DataMember(Name="AudioRecvCodec", EmitDefaultValue=false)]
        public string AudioRecvCodec { get; set; }

        /// <summary>
        /// Gets or Sets SessionIn
        /// </summary>
        [DataMember(Name="SessionIn", EmitDefaultValue=false)]
        public string SessionIn { get; set; }

        /// <summary>
        /// Gets or Sets BondedVideoGuid
        /// </summary>
        [DataMember(Name="BondedVideoGuid", EmitDefaultValue=false)]
        public string BondedVideoGuid { get; set; }

        /// <summary>
        /// Gets or Sets CallQuality
        /// </summary>
        [DataMember(Name="CallQuality", EmitDefaultValue=false)]
        public string CallQuality { get; set; }

        /// <summary>
        /// Gets or Sets Meetingjointime
        /// </summary>
        [DataMember(Name="meetingjointime", EmitDefaultValue=false)]
        public string Meetingjointime { get; set; }

        /// <summary>
        /// Gets or Sets SessionInRelay
        /// </summary>
        [DataMember(Name="SessionInRelay", EmitDefaultValue=false)]
        public string SessionInRelay { get; set; }

        /// <summary>
        /// Gets or Sets Pairedremoteaddress
        /// </summary>
        [DataMember(Name="pairedremoteaddress", EmitDefaultValue=false)]
        public string Pairedremoteaddress { get; set; }

        /// <summary>
        /// Gets or Sets VideoSendHeight
        /// </summary>
        [DataMember(Name="VideoSendHeight", EmitDefaultValue=false)]
        public string VideoSendHeight { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvHeight
        /// </summary>
        [DataMember(Name="VideoRecvHeight", EmitDefaultValue=false)]
        public string VideoRecvHeight { get; set; }

        /// <summary>
        /// Gets or Sets SecureCall
        /// </summary>
        [DataMember(Name="SecureCall", EmitDefaultValue=false)]
        public string SecureCall { get; set; }

        /// <summary>
        /// Gets or Sets VideoLocalRtcpAddress
        /// </summary>
        [DataMember(Name="video.local.rtcpAddress", EmitDefaultValue=false)]
        public string VideoLocalRtcpAddress { get; set; }

        /// <summary>
        /// Gets or Sets AudioPlayName
        /// </summary>
        [DataMember(Name="AudioPlayName", EmitDefaultValue=false)]
        public string AudioPlayName { get; set; }

        /// <summary>
        /// Gets or Sets VideoCapID
        /// </summary>
        [DataMember(Name="VideoCapID", EmitDefaultValue=false)]
        public string VideoCapID { get; set; }

        /// <summary>
        /// Gets or Sets AudioRtpTransport
        /// </summary>
        [DataMember(Name="AudioRtpTransport", EmitDefaultValue=false)]
        public string AudioRtpTransport { get; set; }

        /// <summary>
        /// Gets or Sets MeetingInfoMode
        /// </summary>
        [DataMember(Name="MeetingInfoMode", EmitDefaultValue=false)]
        public string MeetingInfoMode { get; set; }

        /// <summary>
        /// Gets or Sets Callhostname
        /// </summary>
        [DataMember(Name="callhostname", EmitDefaultValue=false)]
        public string Callhostname { get; set; }

        /// <summary>
        /// Gets or Sets Callguid
        /// </summary>
        [DataMember(Name="callguid", EmitDefaultValue=false)]
        public string Callguid { get; set; }

        /// <summary>
        /// Gets or Sets AudioCapID
        /// </summary>
        [DataMember(Name="AudioCapID", EmitDefaultValue=false)]
        public string AudioCapID { get; set; }

        /// <summary>
        /// Gets or Sets VideoSend
        /// </summary>
        [DataMember(Name="VideoSend", EmitDefaultValue=false)]
        public string VideoSend { get; set; }

        /// <summary>
        /// Gets or Sets ContentRecvCodec
        /// </summary>
        [DataMember(Name="ContentRecvCodec", EmitDefaultValue=false)]
        public string ContentRecvCodec { get; set; }

        /// <summary>
        /// Gets or Sets SessionRelay
        /// </summary>
        [DataMember(Name="SessionRelay", EmitDefaultValue=false)]
        public string SessionRelay { get; set; }

        /// <summary>
        /// Gets or Sets VideoRecvRemoteMute
        /// </summary>
        [DataMember(Name="VideoRecvRemoteMute", EmitDefaultValue=false)]
        public string VideoRecvRemoteMute { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets BondedVideoName
        /// </summary>
        [DataMember(Name="BondedVideoName", EmitDefaultValue=false)]
        public string BondedVideoName { get; set; }

        /// <summary>
        /// Gets or Sets IsInRoster
        /// </summary>
        [DataMember(Name="isInRoster", EmitDefaultValue=false)]
        public bool? IsInRoster { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Endpoint {\n");
            sb.Append("  EcMode: ").Append(EcMode).Append("\n");
            sb.Append("  Creationtime: ").Append(Creationtime).Append("\n");
            sb.Append("  AudioRemoteRtcpAddress: ").Append(AudioRemoteRtcpAddress).Append("\n");
            sb.Append("  VideoSendCodec: ").Append(VideoSendCodec).Append("\n");
            sb.Append("  AudioPlayID: ").Append(AudioPlayID).Append("\n");
            sb.Append("  CallQualityRecv: ").Append(CallQualityRecv).Append("\n");
            sb.Append("  SessionOut: ").Append(SessionOut).Append("\n");
            sb.Append("  AudioLocalAddress: ").Append(AudioLocalAddress).Append("\n");
            sb.Append("  Meetingid: ").Append(Meetingid).Append("\n");
            sb.Append("  VideoSendWidth: ").Append(VideoSendWidth).Append("\n");
            sb.Append("  CallQualitySend: ").Append(CallQualitySend).Append("\n");
            sb.Append("  Mhaddress: ").Append(Mhaddress).Append("\n");
            sb.Append("  RDCControlleeCapable: ").Append(RDCControlleeCapable).Append("\n");
            sb.Append("  AudioCapName: ").Append(AudioCapName).Append("\n");
            sb.Append("  ProxyInfo: ").Append(ProxyInfo).Append("\n");
            sb.Append("  AudioSendCodec: ").Append(AudioSendCodec).Append("\n");
            sb.Append("  Vendor: ").Append(Vendor).Append("\n");
            sb.Append("  VideoRecvWidth: ").Append(VideoRecvWidth).Append("\n");
            sb.Append("  Conaddress: ").Append(Conaddress).Append("\n");
            sb.Append("  TalkDetected: ").Append(TalkDetected).Append("\n");
            sb.Append("  SubLayout: ").Append(SubLayout).Append("\n");
            sb.Append("  AudioRtcpRelay: ").Append(AudioRtcpRelay).Append("\n");
            sb.Append("  AudioRecvLocalMute: ").Append(AudioRecvLocalMute).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  VideoLocalAddress: ").Append(VideoLocalAddress).Append("\n");
            sb.Append("  AudioLocalRtcpAddress: ").Append(AudioLocalRtcpAddress).Append("\n");
            sb.Append("  ContentRtpRelay: ").Append(ContentRtpRelay).Append("\n");
            sb.Append("  ContentLocalRtcpAddress: ").Append(ContentLocalRtcpAddress).Append("\n");
            sb.Append("  RemoteConnectionCount: ").Append(RemoteConnectionCount).Append("\n");
            sb.Append("  Callrate: ").Append(Callrate).Append("\n");
            sb.Append("  MixerGuid: ").Append(MixerGuid).Append("\n");
            sb.Append("  Transport: ").Append(Transport).Append("\n");
            sb.Append("  AudioCapSelectID: ").Append(AudioCapSelectID).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  RDCControllerCapable: ").Append(RDCControllerCapable).Append("\n");
            sb.Append("  Pairedname: ").Append(Pairedname).Append("\n");
            sb.Append("  VideoRtcpRelay: ").Append(VideoRtcpRelay).Append("\n");
            sb.Append("  EndpointCpuParams: ").Append(EndpointCpuParams).Append("\n");
            sb.Append("  VideoRemoteAddress: ").Append(VideoRemoteAddress).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  ContentRecv: ").Append(ContentRecv).Append("\n");
            sb.Append("  LocalName: ").Append(LocalName).Append("\n");
            sb.Append("  BJNUserId: ").Append(BJNUserId).Append("\n");
            sb.Append("  ContentRemoteAddress: ").Append(ContentRemoteAddress).Append("\n");
            sb.Append("  AudioSend: ").Append(AudioSend).Append("\n");
            sb.Append("  ParticipantDTMFMenus: ").Append(ParticipantDTMFMenus).Append("\n");
            sb.Append("  VideoRtcpTranspor: ").Append(VideoRtcpTranspor).Append("\n");
            sb.Append("  AudioRtcpTransport: ").Append(AudioRtcpTransport).Append("\n");
            sb.Append("  RelayNodeId: ").Append(RelayNodeId).Append("\n");
            sb.Append("  ContentRemoteRtcpAddress: ").Append(ContentRemoteRtcpAddress).Append("\n");
            sb.Append("  AudioRtpRelay: ").Append(AudioRtpRelay).Append("\n");
            sb.Append("  VideoRtpTransport: ").Append(VideoRtpTransport).Append("\n");
            sb.Append("  ContentRecvLocalMute: ").Append(ContentRecvLocalMute).Append("\n");
            sb.Append("  Layout: ").Append(Layout).Append("\n");
            sb.Append("  ContentSend: ").Append(ContentSend).Append("\n");
            sb.Append("  Remoteaddress: ").Append(Remoteaddress).Append("\n");
            sb.Append("  MeetingGuid: ").Append(MeetingGuid).Append("\n");
            sb.Append("  Connecttime: ").Append(Connecttime).Append("\n");
            sb.Append("  Localaddress: ").Append(Localaddress).Append("\n");
            sb.Append("  AudioRemoteAddress: ").Append(AudioRemoteAddress).Append("\n");
            sb.Append("  BondedAudioGuid: ").Append(BondedAudioGuid).Append("\n");
            sb.Append("  AudioRecvRemoteMute: ").Append(AudioRecvRemoteMute).Append("\n");
            sb.Append("  SessionOutRelay: ").Append(SessionOutRelay).Append("\n");
            sb.Append("  Leader: ").Append(Leader).Append("\n");
            sb.Append("  ContentLocalAddress: ").Append(ContentLocalAddress).Append("\n");
            sb.Append("  MovieCapable: ").Append(MovieCapable).Append("\n");
            sb.Append("  VideoRecvLocalMute: ").Append(VideoRecvLocalMute).Append("\n");
            sb.Append("  ContentRtpTransport: ").Append(ContentRtpTransport).Append("\n");
            sb.Append("  RDCVersion: ").Append(RDCVersion).Append("\n");
            sb.Append("  AudioRecv: ").Append(AudioRecv).Append("\n");
            sb.Append("  ContentRelayServer: ").Append(ContentRelayServer).Append("\n");
            sb.Append("  VideoRecv: ").Append(VideoRecv).Append("\n");
            sb.Append("  Visibility: ").Append(Visibility).Append("\n");
            sb.Append("  Sessionid: ").Append(Sessionid).Append("\n");
            sb.Append("  ContentRtcpRelay: ").Append(ContentRtcpRelay).Append("\n");
            sb.Append("  Locales: ").Append(Locales).Append("\n");
            sb.Append("  Medaddress: ").Append(Medaddress).Append("\n");
            sb.Append("  HtmlLayoutGuid: ").Append(HtmlLayoutGuid).Append("\n");
            sb.Append("  _Endpoint: ").Append(_Endpoint).Append("\n");
            sb.Append("  VideoDrop: ").Append(VideoDrop).Append("\n");
            sb.Append("  ContentRtcpTransport: ").Append(ContentRtcpTransport).Append("\n");
            sb.Append("  VideoRemoteRtcpAddress: ").Append(VideoRemoteRtcpAddress).Append("\n");
            sb.Append("  VideoRtpRelay: ").Append(VideoRtpRelay).Append("\n");
            sb.Append("  Mixaddress: ").Append(Mixaddress).Append("\n");
            sb.Append("  SIPHTTPProxyTransport: ").Append(SIPHTTPProxyTransport).Append("\n");
            sb.Append("  VideoRecvCodec: ").Append(VideoRecvCodec).Append("\n");
            sb.Append("  AudioRecvCodec: ").Append(AudioRecvCodec).Append("\n");
            sb.Append("  SessionIn: ").Append(SessionIn).Append("\n");
            sb.Append("  BondedVideoGuid: ").Append(BondedVideoGuid).Append("\n");
            sb.Append("  CallQuality: ").Append(CallQuality).Append("\n");
            sb.Append("  Meetingjointime: ").Append(Meetingjointime).Append("\n");
            sb.Append("  SessionInRelay: ").Append(SessionInRelay).Append("\n");
            sb.Append("  Pairedremoteaddress: ").Append(Pairedremoteaddress).Append("\n");
            sb.Append("  VideoSendHeight: ").Append(VideoSendHeight).Append("\n");
            sb.Append("  VideoRecvHeight: ").Append(VideoRecvHeight).Append("\n");
            sb.Append("  SecureCall: ").Append(SecureCall).Append("\n");
            sb.Append("  VideoLocalRtcpAddress: ").Append(VideoLocalRtcpAddress).Append("\n");
            sb.Append("  AudioPlayName: ").Append(AudioPlayName).Append("\n");
            sb.Append("  VideoCapID: ").Append(VideoCapID).Append("\n");
            sb.Append("  AudioRtpTransport: ").Append(AudioRtpTransport).Append("\n");
            sb.Append("  MeetingInfoMode: ").Append(MeetingInfoMode).Append("\n");
            sb.Append("  Callhostname: ").Append(Callhostname).Append("\n");
            sb.Append("  Callguid: ").Append(Callguid).Append("\n");
            sb.Append("  AudioCapID: ").Append(AudioCapID).Append("\n");
            sb.Append("  VideoSend: ").Append(VideoSend).Append("\n");
            sb.Append("  ContentRecvCodec: ").Append(ContentRecvCodec).Append("\n");
            sb.Append("  SessionRelay: ").Append(SessionRelay).Append("\n");
            sb.Append("  VideoRecvRemoteMute: ").Append(VideoRecvRemoteMute).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  BondedVideoName: ").Append(BondedVideoName).Append("\n");
            sb.Append("  IsInRoster: ").Append(IsInRoster).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Endpoint);
        }

        /// <summary>
        /// Returns true if Endpoint instances are equal
        /// </summary>
        /// <param name="input">Instance of Endpoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Endpoint input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EcMode == input.EcMode ||
                    (this.EcMode != null &&
                    this.EcMode.Equals(input.EcMode))
                ) && 
                (
                    this.Creationtime == input.Creationtime ||
                    (this.Creationtime != null &&
                    this.Creationtime.Equals(input.Creationtime))
                ) && 
                (
                    this.AudioRemoteRtcpAddress == input.AudioRemoteRtcpAddress ||
                    (this.AudioRemoteRtcpAddress != null &&
                    this.AudioRemoteRtcpAddress.Equals(input.AudioRemoteRtcpAddress))
                ) && 
                (
                    this.VideoSendCodec == input.VideoSendCodec ||
                    (this.VideoSendCodec != null &&
                    this.VideoSendCodec.Equals(input.VideoSendCodec))
                ) && 
                (
                    this.AudioPlayID == input.AudioPlayID ||
                    (this.AudioPlayID != null &&
                    this.AudioPlayID.Equals(input.AudioPlayID))
                ) && 
                (
                    this.CallQualityRecv == input.CallQualityRecv ||
                    (this.CallQualityRecv != null &&
                    this.CallQualityRecv.Equals(input.CallQualityRecv))
                ) && 
                (
                    this.SessionOut == input.SessionOut ||
                    (this.SessionOut != null &&
                    this.SessionOut.Equals(input.SessionOut))
                ) && 
                (
                    this.AudioLocalAddress == input.AudioLocalAddress ||
                    (this.AudioLocalAddress != null &&
                    this.AudioLocalAddress.Equals(input.AudioLocalAddress))
                ) && 
                (
                    this.Meetingid == input.Meetingid ||
                    (this.Meetingid != null &&
                    this.Meetingid.Equals(input.Meetingid))
                ) && 
                (
                    this.VideoSendWidth == input.VideoSendWidth ||
                    (this.VideoSendWidth != null &&
                    this.VideoSendWidth.Equals(input.VideoSendWidth))
                ) && 
                (
                    this.CallQualitySend == input.CallQualitySend ||
                    (this.CallQualitySend != null &&
                    this.CallQualitySend.Equals(input.CallQualitySend))
                ) && 
                (
                    this.Mhaddress == input.Mhaddress ||
                    (this.Mhaddress != null &&
                    this.Mhaddress.Equals(input.Mhaddress))
                ) && 
                (
                    this.RDCControlleeCapable == input.RDCControlleeCapable ||
                    (this.RDCControlleeCapable != null &&
                    this.RDCControlleeCapable.Equals(input.RDCControlleeCapable))
                ) && 
                (
                    this.AudioCapName == input.AudioCapName ||
                    (this.AudioCapName != null &&
                    this.AudioCapName.Equals(input.AudioCapName))
                ) && 
                (
                    this.ProxyInfo == input.ProxyInfo ||
                    (this.ProxyInfo != null &&
                    this.ProxyInfo.Equals(input.ProxyInfo))
                ) && 
                (
                    this.AudioSendCodec == input.AudioSendCodec ||
                    (this.AudioSendCodec != null &&
                    this.AudioSendCodec.Equals(input.AudioSendCodec))
                ) && 
                (
                    this.Vendor == input.Vendor ||
                    (this.Vendor != null &&
                    this.Vendor.Equals(input.Vendor))
                ) && 
                (
                    this.VideoRecvWidth == input.VideoRecvWidth ||
                    (this.VideoRecvWidth != null &&
                    this.VideoRecvWidth.Equals(input.VideoRecvWidth))
                ) && 
                (
                    this.Conaddress == input.Conaddress ||
                    (this.Conaddress != null &&
                    this.Conaddress.Equals(input.Conaddress))
                ) && 
                (
                    this.TalkDetected == input.TalkDetected ||
                    (this.TalkDetected != null &&
                    this.TalkDetected.Equals(input.TalkDetected))
                ) && 
                (
                    this.SubLayout == input.SubLayout ||
                    (this.SubLayout != null &&
                    this.SubLayout.Equals(input.SubLayout))
                ) && 
                (
                    this.AudioRtcpRelay == input.AudioRtcpRelay ||
                    (this.AudioRtcpRelay != null &&
                    this.AudioRtcpRelay.Equals(input.AudioRtcpRelay))
                ) && 
                (
                    this.AudioRecvLocalMute == input.AudioRecvLocalMute ||
                    (this.AudioRecvLocalMute != null &&
                    this.AudioRecvLocalMute.Equals(input.AudioRecvLocalMute))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.VideoLocalAddress == input.VideoLocalAddress ||
                    (this.VideoLocalAddress != null &&
                    this.VideoLocalAddress.Equals(input.VideoLocalAddress))
                ) && 
                (
                    this.AudioLocalRtcpAddress == input.AudioLocalRtcpAddress ||
                    (this.AudioLocalRtcpAddress != null &&
                    this.AudioLocalRtcpAddress.Equals(input.AudioLocalRtcpAddress))
                ) && 
                (
                    this.ContentRtpRelay == input.ContentRtpRelay ||
                    (this.ContentRtpRelay != null &&
                    this.ContentRtpRelay.Equals(input.ContentRtpRelay))
                ) && 
                (
                    this.ContentLocalRtcpAddress == input.ContentLocalRtcpAddress ||
                    (this.ContentLocalRtcpAddress != null &&
                    this.ContentLocalRtcpAddress.Equals(input.ContentLocalRtcpAddress))
                ) && 
                (
                    this.RemoteConnectionCount == input.RemoteConnectionCount ||
                    (this.RemoteConnectionCount != null &&
                    this.RemoteConnectionCount.Equals(input.RemoteConnectionCount))
                ) && 
                (
                    this.Callrate == input.Callrate ||
                    (this.Callrate != null &&
                    this.Callrate.Equals(input.Callrate))
                ) && 
                (
                    this.MixerGuid == input.MixerGuid ||
                    (this.MixerGuid != null &&
                    this.MixerGuid.Equals(input.MixerGuid))
                ) && 
                (
                    this.Transport == input.Transport ||
                    (this.Transport != null &&
                    this.Transport.Equals(input.Transport))
                ) && 
                (
                    this.AudioCapSelectID == input.AudioCapSelectID ||
                    (this.AudioCapSelectID != null &&
                    this.AudioCapSelectID.Equals(input.AudioCapSelectID))
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.RDCControllerCapable == input.RDCControllerCapable ||
                    (this.RDCControllerCapable != null &&
                    this.RDCControllerCapable.Equals(input.RDCControllerCapable))
                ) && 
                (
                    this.Pairedname == input.Pairedname ||
                    (this.Pairedname != null &&
                    this.Pairedname.Equals(input.Pairedname))
                ) && 
                (
                    this.VideoRtcpRelay == input.VideoRtcpRelay ||
                    (this.VideoRtcpRelay != null &&
                    this.VideoRtcpRelay.Equals(input.VideoRtcpRelay))
                ) && 
                (
                    this.EndpointCpuParams == input.EndpointCpuParams ||
                    (this.EndpointCpuParams != null &&
                    this.EndpointCpuParams.Equals(input.EndpointCpuParams))
                ) && 
                (
                    this.VideoRemoteAddress == input.VideoRemoteAddress ||
                    (this.VideoRemoteAddress != null &&
                    this.VideoRemoteAddress.Equals(input.VideoRemoteAddress))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                ) && 
                (
                    this.ContentRecv == input.ContentRecv ||
                    (this.ContentRecv != null &&
                    this.ContentRecv.Equals(input.ContentRecv))
                ) && 
                (
                    this.LocalName == input.LocalName ||
                    (this.LocalName != null &&
                    this.LocalName.Equals(input.LocalName))
                ) && 
                (
                    this.BJNUserId == input.BJNUserId ||
                    (this.BJNUserId != null &&
                    this.BJNUserId.Equals(input.BJNUserId))
                ) && 
                (
                    this.ContentRemoteAddress == input.ContentRemoteAddress ||
                    (this.ContentRemoteAddress != null &&
                    this.ContentRemoteAddress.Equals(input.ContentRemoteAddress))
                ) && 
                (
                    this.AudioSend == input.AudioSend ||
                    (this.AudioSend != null &&
                    this.AudioSend.Equals(input.AudioSend))
                ) && 
                (
                    this.ParticipantDTMFMenus == input.ParticipantDTMFMenus ||
                    (this.ParticipantDTMFMenus != null &&
                    this.ParticipantDTMFMenus.Equals(input.ParticipantDTMFMenus))
                ) && 
                (
                    this.VideoRtcpTranspor == input.VideoRtcpTranspor ||
                    (this.VideoRtcpTranspor != null &&
                    this.VideoRtcpTranspor.Equals(input.VideoRtcpTranspor))
                ) && 
                (
                    this.AudioRtcpTransport == input.AudioRtcpTransport ||
                    (this.AudioRtcpTransport != null &&
                    this.AudioRtcpTransport.Equals(input.AudioRtcpTransport))
                ) && 
                (
                    this.RelayNodeId == input.RelayNodeId ||
                    (this.RelayNodeId != null &&
                    this.RelayNodeId.Equals(input.RelayNodeId))
                ) && 
                (
                    this.ContentRemoteRtcpAddress == input.ContentRemoteRtcpAddress ||
                    (this.ContentRemoteRtcpAddress != null &&
                    this.ContentRemoteRtcpAddress.Equals(input.ContentRemoteRtcpAddress))
                ) && 
                (
                    this.AudioRtpRelay == input.AudioRtpRelay ||
                    (this.AudioRtpRelay != null &&
                    this.AudioRtpRelay.Equals(input.AudioRtpRelay))
                ) && 
                (
                    this.VideoRtpTransport == input.VideoRtpTransport ||
                    (this.VideoRtpTransport != null &&
                    this.VideoRtpTransport.Equals(input.VideoRtpTransport))
                ) && 
                (
                    this.ContentRecvLocalMute == input.ContentRecvLocalMute ||
                    (this.ContentRecvLocalMute != null &&
                    this.ContentRecvLocalMute.Equals(input.ContentRecvLocalMute))
                ) && 
                (
                    this.Layout == input.Layout ||
                    (this.Layout != null &&
                    this.Layout.Equals(input.Layout))
                ) && 
                (
                    this.ContentSend == input.ContentSend ||
                    (this.ContentSend != null &&
                    this.ContentSend.Equals(input.ContentSend))
                ) && 
                (
                    this.Remoteaddress == input.Remoteaddress ||
                    (this.Remoteaddress != null &&
                    this.Remoteaddress.Equals(input.Remoteaddress))
                ) && 
                (
                    this.MeetingGuid == input.MeetingGuid ||
                    (this.MeetingGuid != null &&
                    this.MeetingGuid.Equals(input.MeetingGuid))
                ) && 
                (
                    this.Connecttime == input.Connecttime ||
                    (this.Connecttime != null &&
                    this.Connecttime.Equals(input.Connecttime))
                ) && 
                (
                    this.Localaddress == input.Localaddress ||
                    (this.Localaddress != null &&
                    this.Localaddress.Equals(input.Localaddress))
                ) && 
                (
                    this.AudioRemoteAddress == input.AudioRemoteAddress ||
                    (this.AudioRemoteAddress != null &&
                    this.AudioRemoteAddress.Equals(input.AudioRemoteAddress))
                ) && 
                (
                    this.BondedAudioGuid == input.BondedAudioGuid ||
                    (this.BondedAudioGuid != null &&
                    this.BondedAudioGuid.Equals(input.BondedAudioGuid))
                ) && 
                (
                    this.AudioRecvRemoteMute == input.AudioRecvRemoteMute ||
                    (this.AudioRecvRemoteMute != null &&
                    this.AudioRecvRemoteMute.Equals(input.AudioRecvRemoteMute))
                ) && 
                (
                    this.SessionOutRelay == input.SessionOutRelay ||
                    (this.SessionOutRelay != null &&
                    this.SessionOutRelay.Equals(input.SessionOutRelay))
                ) && 
                (
                    this.Leader == input.Leader ||
                    (this.Leader != null &&
                    this.Leader.Equals(input.Leader))
                ) && 
                (
                    this.ContentLocalAddress == input.ContentLocalAddress ||
                    (this.ContentLocalAddress != null &&
                    this.ContentLocalAddress.Equals(input.ContentLocalAddress))
                ) && 
                (
                    this.MovieCapable == input.MovieCapable ||
                    (this.MovieCapable != null &&
                    this.MovieCapable.Equals(input.MovieCapable))
                ) && 
                (
                    this.VideoRecvLocalMute == input.VideoRecvLocalMute ||
                    (this.VideoRecvLocalMute != null &&
                    this.VideoRecvLocalMute.Equals(input.VideoRecvLocalMute))
                ) && 
                (
                    this.ContentRtpTransport == input.ContentRtpTransport ||
                    (this.ContentRtpTransport != null &&
                    this.ContentRtpTransport.Equals(input.ContentRtpTransport))
                ) && 
                (
                    this.RDCVersion == input.RDCVersion ||
                    (this.RDCVersion != null &&
                    this.RDCVersion.Equals(input.RDCVersion))
                ) && 
                (
                    this.AudioRecv == input.AudioRecv ||
                    (this.AudioRecv != null &&
                    this.AudioRecv.Equals(input.AudioRecv))
                ) && 
                (
                    this.ContentRelayServer == input.ContentRelayServer ||
                    (this.ContentRelayServer != null &&
                    this.ContentRelayServer.Equals(input.ContentRelayServer))
                ) && 
                (
                    this.VideoRecv == input.VideoRecv ||
                    (this.VideoRecv != null &&
                    this.VideoRecv.Equals(input.VideoRecv))
                ) && 
                (
                    this.Visibility == input.Visibility ||
                    (this.Visibility != null &&
                    this.Visibility.Equals(input.Visibility))
                ) && 
                (
                    this.Sessionid == input.Sessionid ||
                    (this.Sessionid != null &&
                    this.Sessionid.Equals(input.Sessionid))
                ) && 
                (
                    this.ContentRtcpRelay == input.ContentRtcpRelay ||
                    (this.ContentRtcpRelay != null &&
                    this.ContentRtcpRelay.Equals(input.ContentRtcpRelay))
                ) && 
                (
                    this.Locales == input.Locales ||
                    (this.Locales != null &&
                    this.Locales.Equals(input.Locales))
                ) && 
                (
                    this.Medaddress == input.Medaddress ||
                    (this.Medaddress != null &&
                    this.Medaddress.Equals(input.Medaddress))
                ) && 
                (
                    this.HtmlLayoutGuid == input.HtmlLayoutGuid ||
                    (this.HtmlLayoutGuid != null &&
                    this.HtmlLayoutGuid.Equals(input.HtmlLayoutGuid))
                ) && 
                (
                    this._Endpoint == input._Endpoint ||
                    (this._Endpoint != null &&
                    this._Endpoint.Equals(input._Endpoint))
                ) && 
                (
                    this.VideoDrop == input.VideoDrop ||
                    (this.VideoDrop != null &&
                    this.VideoDrop.Equals(input.VideoDrop))
                ) && 
                (
                    this.ContentRtcpTransport == input.ContentRtcpTransport ||
                    (this.ContentRtcpTransport != null &&
                    this.ContentRtcpTransport.Equals(input.ContentRtcpTransport))
                ) && 
                (
                    this.VideoRemoteRtcpAddress == input.VideoRemoteRtcpAddress ||
                    (this.VideoRemoteRtcpAddress != null &&
                    this.VideoRemoteRtcpAddress.Equals(input.VideoRemoteRtcpAddress))
                ) && 
                (
                    this.VideoRtpRelay == input.VideoRtpRelay ||
                    (this.VideoRtpRelay != null &&
                    this.VideoRtpRelay.Equals(input.VideoRtpRelay))
                ) && 
                (
                    this.Mixaddress == input.Mixaddress ||
                    (this.Mixaddress != null &&
                    this.Mixaddress.Equals(input.Mixaddress))
                ) && 
                (
                    this.SIPHTTPProxyTransport == input.SIPHTTPProxyTransport ||
                    (this.SIPHTTPProxyTransport != null &&
                    this.SIPHTTPProxyTransport.Equals(input.SIPHTTPProxyTransport))
                ) && 
                (
                    this.VideoRecvCodec == input.VideoRecvCodec ||
                    (this.VideoRecvCodec != null &&
                    this.VideoRecvCodec.Equals(input.VideoRecvCodec))
                ) && 
                (
                    this.AudioRecvCodec == input.AudioRecvCodec ||
                    (this.AudioRecvCodec != null &&
                    this.AudioRecvCodec.Equals(input.AudioRecvCodec))
                ) && 
                (
                    this.SessionIn == input.SessionIn ||
                    (this.SessionIn != null &&
                    this.SessionIn.Equals(input.SessionIn))
                ) && 
                (
                    this.BondedVideoGuid == input.BondedVideoGuid ||
                    (this.BondedVideoGuid != null &&
                    this.BondedVideoGuid.Equals(input.BondedVideoGuid))
                ) && 
                (
                    this.CallQuality == input.CallQuality ||
                    (this.CallQuality != null &&
                    this.CallQuality.Equals(input.CallQuality))
                ) && 
                (
                    this.Meetingjointime == input.Meetingjointime ||
                    (this.Meetingjointime != null &&
                    this.Meetingjointime.Equals(input.Meetingjointime))
                ) && 
                (
                    this.SessionInRelay == input.SessionInRelay ||
                    (this.SessionInRelay != null &&
                    this.SessionInRelay.Equals(input.SessionInRelay))
                ) && 
                (
                    this.Pairedremoteaddress == input.Pairedremoteaddress ||
                    (this.Pairedremoteaddress != null &&
                    this.Pairedremoteaddress.Equals(input.Pairedremoteaddress))
                ) && 
                (
                    this.VideoSendHeight == input.VideoSendHeight ||
                    (this.VideoSendHeight != null &&
                    this.VideoSendHeight.Equals(input.VideoSendHeight))
                ) && 
                (
                    this.VideoRecvHeight == input.VideoRecvHeight ||
                    (this.VideoRecvHeight != null &&
                    this.VideoRecvHeight.Equals(input.VideoRecvHeight))
                ) && 
                (
                    this.SecureCall == input.SecureCall ||
                    (this.SecureCall != null &&
                    this.SecureCall.Equals(input.SecureCall))
                ) && 
                (
                    this.VideoLocalRtcpAddress == input.VideoLocalRtcpAddress ||
                    (this.VideoLocalRtcpAddress != null &&
                    this.VideoLocalRtcpAddress.Equals(input.VideoLocalRtcpAddress))
                ) && 
                (
                    this.AudioPlayName == input.AudioPlayName ||
                    (this.AudioPlayName != null &&
                    this.AudioPlayName.Equals(input.AudioPlayName))
                ) && 
                (
                    this.VideoCapID == input.VideoCapID ||
                    (this.VideoCapID != null &&
                    this.VideoCapID.Equals(input.VideoCapID))
                ) && 
                (
                    this.AudioRtpTransport == input.AudioRtpTransport ||
                    (this.AudioRtpTransport != null &&
                    this.AudioRtpTransport.Equals(input.AudioRtpTransport))
                ) && 
                (
                    this.MeetingInfoMode == input.MeetingInfoMode ||
                    (this.MeetingInfoMode != null &&
                    this.MeetingInfoMode.Equals(input.MeetingInfoMode))
                ) && 
                (
                    this.Callhostname == input.Callhostname ||
                    (this.Callhostname != null &&
                    this.Callhostname.Equals(input.Callhostname))
                ) && 
                (
                    this.Callguid == input.Callguid ||
                    (this.Callguid != null &&
                    this.Callguid.Equals(input.Callguid))
                ) && 
                (
                    this.AudioCapID == input.AudioCapID ||
                    (this.AudioCapID != null &&
                    this.AudioCapID.Equals(input.AudioCapID))
                ) && 
                (
                    this.VideoSend == input.VideoSend ||
                    (this.VideoSend != null &&
                    this.VideoSend.Equals(input.VideoSend))
                ) && 
                (
                    this.ContentRecvCodec == input.ContentRecvCodec ||
                    (this.ContentRecvCodec != null &&
                    this.ContentRecvCodec.Equals(input.ContentRecvCodec))
                ) && 
                (
                    this.SessionRelay == input.SessionRelay ||
                    (this.SessionRelay != null &&
                    this.SessionRelay.Equals(input.SessionRelay))
                ) && 
                (
                    this.VideoRecvRemoteMute == input.VideoRecvRemoteMute ||
                    (this.VideoRecvRemoteMute != null &&
                    this.VideoRecvRemoteMute.Equals(input.VideoRecvRemoteMute))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.BondedVideoName == input.BondedVideoName ||
                    (this.BondedVideoName != null &&
                    this.BondedVideoName.Equals(input.BondedVideoName))
                ) && 
                (
                    this.IsInRoster == input.IsInRoster ||
                    (this.IsInRoster != null &&
                    this.IsInRoster.Equals(input.IsInRoster))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.EcMode != null)
                    hashCode = hashCode * 59 + this.EcMode.GetHashCode();
                if (this.Creationtime != null)
                    hashCode = hashCode * 59 + this.Creationtime.GetHashCode();
                if (this.AudioRemoteRtcpAddress != null)
                    hashCode = hashCode * 59 + this.AudioRemoteRtcpAddress.GetHashCode();
                if (this.VideoSendCodec != null)
                    hashCode = hashCode * 59 + this.VideoSendCodec.GetHashCode();
                if (this.AudioPlayID != null)
                    hashCode = hashCode * 59 + this.AudioPlayID.GetHashCode();
                if (this.CallQualityRecv != null)
                    hashCode = hashCode * 59 + this.CallQualityRecv.GetHashCode();
                if (this.SessionOut != null)
                    hashCode = hashCode * 59 + this.SessionOut.GetHashCode();
                if (this.AudioLocalAddress != null)
                    hashCode = hashCode * 59 + this.AudioLocalAddress.GetHashCode();
                if (this.Meetingid != null)
                    hashCode = hashCode * 59 + this.Meetingid.GetHashCode();
                if (this.VideoSendWidth != null)
                    hashCode = hashCode * 59 + this.VideoSendWidth.GetHashCode();
                if (this.CallQualitySend != null)
                    hashCode = hashCode * 59 + this.CallQualitySend.GetHashCode();
                if (this.Mhaddress != null)
                    hashCode = hashCode * 59 + this.Mhaddress.GetHashCode();
                if (this.RDCControlleeCapable != null)
                    hashCode = hashCode * 59 + this.RDCControlleeCapable.GetHashCode();
                if (this.AudioCapName != null)
                    hashCode = hashCode * 59 + this.AudioCapName.GetHashCode();
                if (this.ProxyInfo != null)
                    hashCode = hashCode * 59 + this.ProxyInfo.GetHashCode();
                if (this.AudioSendCodec != null)
                    hashCode = hashCode * 59 + this.AudioSendCodec.GetHashCode();
                if (this.Vendor != null)
                    hashCode = hashCode * 59 + this.Vendor.GetHashCode();
                if (this.VideoRecvWidth != null)
                    hashCode = hashCode * 59 + this.VideoRecvWidth.GetHashCode();
                if (this.Conaddress != null)
                    hashCode = hashCode * 59 + this.Conaddress.GetHashCode();
                if (this.TalkDetected != null)
                    hashCode = hashCode * 59 + this.TalkDetected.GetHashCode();
                if (this.SubLayout != null)
                    hashCode = hashCode * 59 + this.SubLayout.GetHashCode();
                if (this.AudioRtcpRelay != null)
                    hashCode = hashCode * 59 + this.AudioRtcpRelay.GetHashCode();
                if (this.AudioRecvLocalMute != null)
                    hashCode = hashCode * 59 + this.AudioRecvLocalMute.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.VideoLocalAddress != null)
                    hashCode = hashCode * 59 + this.VideoLocalAddress.GetHashCode();
                if (this.AudioLocalRtcpAddress != null)
                    hashCode = hashCode * 59 + this.AudioLocalRtcpAddress.GetHashCode();
                if (this.ContentRtpRelay != null)
                    hashCode = hashCode * 59 + this.ContentRtpRelay.GetHashCode();
                if (this.ContentLocalRtcpAddress != null)
                    hashCode = hashCode * 59 + this.ContentLocalRtcpAddress.GetHashCode();
                if (this.RemoteConnectionCount != null)
                    hashCode = hashCode * 59 + this.RemoteConnectionCount.GetHashCode();
                if (this.Callrate != null)
                    hashCode = hashCode * 59 + this.Callrate.GetHashCode();
                if (this.MixerGuid != null)
                    hashCode = hashCode * 59 + this.MixerGuid.GetHashCode();
                if (this.Transport != null)
                    hashCode = hashCode * 59 + this.Transport.GetHashCode();
                if (this.AudioCapSelectID != null)
                    hashCode = hashCode * 59 + this.AudioCapSelectID.GetHashCode();
                if (this.CountryCode != null)
                    hashCode = hashCode * 59 + this.CountryCode.GetHashCode();
                if (this.RDCControllerCapable != null)
                    hashCode = hashCode * 59 + this.RDCControllerCapable.GetHashCode();
                if (this.Pairedname != null)
                    hashCode = hashCode * 59 + this.Pairedname.GetHashCode();
                if (this.VideoRtcpRelay != null)
                    hashCode = hashCode * 59 + this.VideoRtcpRelay.GetHashCode();
                if (this.EndpointCpuParams != null)
                    hashCode = hashCode * 59 + this.EndpointCpuParams.GetHashCode();
                if (this.VideoRemoteAddress != null)
                    hashCode = hashCode * 59 + this.VideoRemoteAddress.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.ContentRecv != null)
                    hashCode = hashCode * 59 + this.ContentRecv.GetHashCode();
                if (this.LocalName != null)
                    hashCode = hashCode * 59 + this.LocalName.GetHashCode();
                if (this.BJNUserId != null)
                    hashCode = hashCode * 59 + this.BJNUserId.GetHashCode();
                if (this.ContentRemoteAddress != null)
                    hashCode = hashCode * 59 + this.ContentRemoteAddress.GetHashCode();
                if (this.AudioSend != null)
                    hashCode = hashCode * 59 + this.AudioSend.GetHashCode();
                if (this.ParticipantDTMFMenus != null)
                    hashCode = hashCode * 59 + this.ParticipantDTMFMenus.GetHashCode();
                if (this.VideoRtcpTranspor != null)
                    hashCode = hashCode * 59 + this.VideoRtcpTranspor.GetHashCode();
                if (this.AudioRtcpTransport != null)
                    hashCode = hashCode * 59 + this.AudioRtcpTransport.GetHashCode();
                if (this.RelayNodeId != null)
                    hashCode = hashCode * 59 + this.RelayNodeId.GetHashCode();
                if (this.ContentRemoteRtcpAddress != null)
                    hashCode = hashCode * 59 + this.ContentRemoteRtcpAddress.GetHashCode();
                if (this.AudioRtpRelay != null)
                    hashCode = hashCode * 59 + this.AudioRtpRelay.GetHashCode();
                if (this.VideoRtpTransport != null)
                    hashCode = hashCode * 59 + this.VideoRtpTransport.GetHashCode();
                if (this.ContentRecvLocalMute != null)
                    hashCode = hashCode * 59 + this.ContentRecvLocalMute.GetHashCode();
                if (this.Layout != null)
                    hashCode = hashCode * 59 + this.Layout.GetHashCode();
                if (this.ContentSend != null)
                    hashCode = hashCode * 59 + this.ContentSend.GetHashCode();
                if (this.Remoteaddress != null)
                    hashCode = hashCode * 59 + this.Remoteaddress.GetHashCode();
                if (this.MeetingGuid != null)
                    hashCode = hashCode * 59 + this.MeetingGuid.GetHashCode();
                if (this.Connecttime != null)
                    hashCode = hashCode * 59 + this.Connecttime.GetHashCode();
                if (this.Localaddress != null)
                    hashCode = hashCode * 59 + this.Localaddress.GetHashCode();
                if (this.AudioRemoteAddress != null)
                    hashCode = hashCode * 59 + this.AudioRemoteAddress.GetHashCode();
                if (this.BondedAudioGuid != null)
                    hashCode = hashCode * 59 + this.BondedAudioGuid.GetHashCode();
                if (this.AudioRecvRemoteMute != null)
                    hashCode = hashCode * 59 + this.AudioRecvRemoteMute.GetHashCode();
                if (this.SessionOutRelay != null)
                    hashCode = hashCode * 59 + this.SessionOutRelay.GetHashCode();
                if (this.Leader != null)
                    hashCode = hashCode * 59 + this.Leader.GetHashCode();
                if (this.ContentLocalAddress != null)
                    hashCode = hashCode * 59 + this.ContentLocalAddress.GetHashCode();
                if (this.MovieCapable != null)
                    hashCode = hashCode * 59 + this.MovieCapable.GetHashCode();
                if (this.VideoRecvLocalMute != null)
                    hashCode = hashCode * 59 + this.VideoRecvLocalMute.GetHashCode();
                if (this.ContentRtpTransport != null)
                    hashCode = hashCode * 59 + this.ContentRtpTransport.GetHashCode();
                if (this.RDCVersion != null)
                    hashCode = hashCode * 59 + this.RDCVersion.GetHashCode();
                if (this.AudioRecv != null)
                    hashCode = hashCode * 59 + this.AudioRecv.GetHashCode();
                if (this.ContentRelayServer != null)
                    hashCode = hashCode * 59 + this.ContentRelayServer.GetHashCode();
                if (this.VideoRecv != null)
                    hashCode = hashCode * 59 + this.VideoRecv.GetHashCode();
                if (this.Visibility != null)
                    hashCode = hashCode * 59 + this.Visibility.GetHashCode();
                if (this.Sessionid != null)
                    hashCode = hashCode * 59 + this.Sessionid.GetHashCode();
                if (this.ContentRtcpRelay != null)
                    hashCode = hashCode * 59 + this.ContentRtcpRelay.GetHashCode();
                if (this.Locales != null)
                    hashCode = hashCode * 59 + this.Locales.GetHashCode();
                if (this.Medaddress != null)
                    hashCode = hashCode * 59 + this.Medaddress.GetHashCode();
                if (this.HtmlLayoutGuid != null)
                    hashCode = hashCode * 59 + this.HtmlLayoutGuid.GetHashCode();
                if (this._Endpoint != null)
                    hashCode = hashCode * 59 + this._Endpoint.GetHashCode();
                if (this.VideoDrop != null)
                    hashCode = hashCode * 59 + this.VideoDrop.GetHashCode();
                if (this.ContentRtcpTransport != null)
                    hashCode = hashCode * 59 + this.ContentRtcpTransport.GetHashCode();
                if (this.VideoRemoteRtcpAddress != null)
                    hashCode = hashCode * 59 + this.VideoRemoteRtcpAddress.GetHashCode();
                if (this.VideoRtpRelay != null)
                    hashCode = hashCode * 59 + this.VideoRtpRelay.GetHashCode();
                if (this.Mixaddress != null)
                    hashCode = hashCode * 59 + this.Mixaddress.GetHashCode();
                if (this.SIPHTTPProxyTransport != null)
                    hashCode = hashCode * 59 + this.SIPHTTPProxyTransport.GetHashCode();
                if (this.VideoRecvCodec != null)
                    hashCode = hashCode * 59 + this.VideoRecvCodec.GetHashCode();
                if (this.AudioRecvCodec != null)
                    hashCode = hashCode * 59 + this.AudioRecvCodec.GetHashCode();
                if (this.SessionIn != null)
                    hashCode = hashCode * 59 + this.SessionIn.GetHashCode();
                if (this.BondedVideoGuid != null)
                    hashCode = hashCode * 59 + this.BondedVideoGuid.GetHashCode();
                if (this.CallQuality != null)
                    hashCode = hashCode * 59 + this.CallQuality.GetHashCode();
                if (this.Meetingjointime != null)
                    hashCode = hashCode * 59 + this.Meetingjointime.GetHashCode();
                if (this.SessionInRelay != null)
                    hashCode = hashCode * 59 + this.SessionInRelay.GetHashCode();
                if (this.Pairedremoteaddress != null)
                    hashCode = hashCode * 59 + this.Pairedremoteaddress.GetHashCode();
                if (this.VideoSendHeight != null)
                    hashCode = hashCode * 59 + this.VideoSendHeight.GetHashCode();
                if (this.VideoRecvHeight != null)
                    hashCode = hashCode * 59 + this.VideoRecvHeight.GetHashCode();
                if (this.SecureCall != null)
                    hashCode = hashCode * 59 + this.SecureCall.GetHashCode();
                if (this.VideoLocalRtcpAddress != null)
                    hashCode = hashCode * 59 + this.VideoLocalRtcpAddress.GetHashCode();
                if (this.AudioPlayName != null)
                    hashCode = hashCode * 59 + this.AudioPlayName.GetHashCode();
                if (this.VideoCapID != null)
                    hashCode = hashCode * 59 + this.VideoCapID.GetHashCode();
                if (this.AudioRtpTransport != null)
                    hashCode = hashCode * 59 + this.AudioRtpTransport.GetHashCode();
                if (this.MeetingInfoMode != null)
                    hashCode = hashCode * 59 + this.MeetingInfoMode.GetHashCode();
                if (this.Callhostname != null)
                    hashCode = hashCode * 59 + this.Callhostname.GetHashCode();
                if (this.Callguid != null)
                    hashCode = hashCode * 59 + this.Callguid.GetHashCode();
                if (this.AudioCapID != null)
                    hashCode = hashCode * 59 + this.AudioCapID.GetHashCode();
                if (this.VideoSend != null)
                    hashCode = hashCode * 59 + this.VideoSend.GetHashCode();
                if (this.ContentRecvCodec != null)
                    hashCode = hashCode * 59 + this.ContentRecvCodec.GetHashCode();
                if (this.SessionRelay != null)
                    hashCode = hashCode * 59 + this.SessionRelay.GetHashCode();
                if (this.VideoRecvRemoteMute != null)
                    hashCode = hashCode * 59 + this.VideoRecvRemoteMute.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.BondedVideoName != null)
                    hashCode = hashCode * 59 + this.BondedVideoName.GetHashCode();
                if (this.IsInRoster != null)
                    hashCode = hashCode * 59 + this.IsInRoster.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
