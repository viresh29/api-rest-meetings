/* 
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 3 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to the user. * Authorization Code Grant – Authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access code. (\"three-legged OAuth\") * Password Credentials Grant – Authenticate with a Username and password and receives an access code. (\"two-legged OAuth\"); * Client Credentials Grant – Similar to Password Grant (\"two-legged OAuth\"). ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – scope of APIs is limited to individual meetings. * User-level – scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users.  All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
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

namespace com.bluejeans.api.rest.onvideo.Model
{
    /// <summary>
    /// GrantRequestCode
    /// </summary>
    [DataContract]
    public partial class GrantRequestCode :  IEquatable<GrantRequestCode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GrantRequestCode" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GrantRequestCode() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GrantRequestCode" /> class.
        /// </summary>
        /// <param name="GrantType">The type of access token you are requesting. (required) (default to &quot;authorization_code&quot;).</param>
        /// <param name="ClientId">The client ID will be generated on creation of the application. Normally, a 32 character hexidecimal numeric string. (required).</param>
        /// <param name="ClientSecret">The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate. (required).</param>
        /// <param name="RedirectUri">One of the registered url or sub-url of registered urls. (required).</param>
        /// <param name="Code">Code obtained after /oauth2/authorize redirect. (required).</param>
        public GrantRequestCode(string GrantType = "authorization_code", string ClientId = default(string), string ClientSecret = default(string), string RedirectUri = default(string), string Code = default(string))
        {
            // to ensure "GrantType" is required (not null)
            if (GrantType == null)
            {
                throw new InvalidDataException("GrantType is a required property for GrantRequestCode and cannot be null");
            }
            else
            {
                this.GrantType = GrantType;
            }
            // to ensure "ClientId" is required (not null)
            if (ClientId == null)
            {
                throw new InvalidDataException("ClientId is a required property for GrantRequestCode and cannot be null");
            }
            else
            {
                this.ClientId = ClientId;
            }
            // to ensure "ClientSecret" is required (not null)
            if (ClientSecret == null)
            {
                throw new InvalidDataException("ClientSecret is a required property for GrantRequestCode and cannot be null");
            }
            else
            {
                this.ClientSecret = ClientSecret;
            }
            // to ensure "RedirectUri" is required (not null)
            if (RedirectUri == null)
            {
                throw new InvalidDataException("RedirectUri is a required property for GrantRequestCode and cannot be null");
            }
            else
            {
                this.RedirectUri = RedirectUri;
            }
            // to ensure "Code" is required (not null)
            if (Code == null)
            {
                throw new InvalidDataException("Code is a required property for GrantRequestCode and cannot be null");
            }
            else
            {
                this.Code = Code;
            }
        }
        
        /// <summary>
        /// The type of access token you are requesting.
        /// </summary>
        /// <value>The type of access token you are requesting.</value>
        [DataMember(Name="grant_type", EmitDefaultValue=false)]
        public string GrantType { get; set; }
        /// <summary>
        /// The client ID will be generated on creation of the application. Normally, a 32 character hexidecimal numeric string.
        /// </summary>
        /// <value>The client ID will be generated on creation of the application. Normally, a 32 character hexidecimal numeric string.</value>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public string ClientId { get; set; }
        /// <summary>
        /// The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.
        /// </summary>
        /// <value>The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.</value>
        [DataMember(Name="client_secret", EmitDefaultValue=false)]
        public string ClientSecret { get; set; }
        /// <summary>
        /// One of the registered url or sub-url of registered urls.
        /// </summary>
        /// <value>One of the registered url or sub-url of registered urls.</value>
        [DataMember(Name="redirectUri", EmitDefaultValue=false)]
        public string RedirectUri { get; set; }
        /// <summary>
        /// Code obtained after /oauth2/authorize redirect.
        /// </summary>
        /// <value>Code obtained after /oauth2/authorize redirect.</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GrantRequestCode {\n");
            sb.Append("  GrantType: ").Append(GrantType).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("  RedirectUri: ").Append(RedirectUri).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as GrantRequestCode);
        }

        /// <summary>
        /// Returns true if GrantRequestCode instances are equal
        /// </summary>
        /// <param name="other">Instance of GrantRequestCode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GrantRequestCode other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.GrantType == other.GrantType ||
                    this.GrantType != null &&
                    this.GrantType.Equals(other.GrantType)
                ) && 
                (
                    this.ClientId == other.ClientId ||
                    this.ClientId != null &&
                    this.ClientId.Equals(other.ClientId)
                ) && 
                (
                    this.ClientSecret == other.ClientSecret ||
                    this.ClientSecret != null &&
                    this.ClientSecret.Equals(other.ClientSecret)
                ) && 
                (
                    this.RedirectUri == other.RedirectUri ||
                    this.RedirectUri != null &&
                    this.RedirectUri.Equals(other.RedirectUri)
                ) && 
                (
                    this.Code == other.Code ||
                    this.Code != null &&
                    this.Code.Equals(other.Code)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.GrantType != null)
                    hash = hash * 59 + this.GrantType.GetHashCode();
                if (this.ClientId != null)
                    hash = hash * 59 + this.ClientId.GetHashCode();
                if (this.ClientSecret != null)
                    hash = hash * 59 + this.ClientSecret.GetHashCode();
                if (this.RedirectUri != null)
                    hash = hash * 59 + this.RedirectUri.GetHashCode();
                if (this.Code != null)
                    hash = hash * 59 + this.Code.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}