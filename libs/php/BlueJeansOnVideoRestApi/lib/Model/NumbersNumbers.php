<?php
/**
 * NumbersNumbers
 *
 * PHP version 5
 *
 * @category Class
 * @package  BlueJeansOnVideoRestApi
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans onVideo REST API
 *
 * ## Video That Works Where You Do. This site provides developers access to APIs from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data and current state information. With these APIs you can quickly integrate **BlueJeans** video administration into your applications.   <hr>  <h2 class=\"info\"> What is a BlueJeans Meeting?</h2> <img src=\"./img/bjnmeeting.png\" style=\"padding-left:20px; width:50%\">  A BlueJeans meeting is a collaboration session of 2 or more participants joining a virtual meeting-room in the cloud.   The first person to join is put into a waiting-room until other participant(s) join.  When the meeting starts, all participants will be connected over video & audio.  <u>Types of Meeting Rooms</u> There are two types of Meeting Rooms available to a registered user.  They are described as: <ul> <li>Scheduled – A room created for a specific date and time.  It is assigned a randomized and unique numeric ID by BlueJeans.</li> <li>Personal – Every user is given a personal meeting room with a customized Meeting Identifier.  People typically use their mobile phone number as their Meeting ID.</li> </ul> <u>Meeting Room Security</u> A meeting room can <i>optionally</i> be protected by an access code.  THe access code can ensure security of participants who can join, and also designate user(s) who need an ability to moderate a meeting. <ul> <li>When set, participants would be required to enter the access code in order to join.</li> <li>, and may be assigned a moderator passcode allowing designated user(s) greater privileges to help organize meetings.</li> </ul> <hr>  <h2 id='gs' class=\"info\" onclick=\"hideit('gs')\"><span id=\"gsicon\" class=\"glyphicon glyphicon-chevron-right\"></span> Getting Started</h2> <div id=\"gsbody\" style=\"display:none\"> Before you start using BlueJeans' APIs, you must first have a BlueJeans account enabled for API Access.  Contact <a href=\"mailto:Support@BlueJeans.com)\">BlueJeans Support</a> for assistance.  <br /><br />Once you have an account, you may start writing application code to authenticate and make API calls.  *Alternatively*, you can use this developer site to test the BlueJeans' APIs and develop a level of familiarity before you write production code.  <br />  ### To Make API Calls from This Site If you want to use this developer site to try various BlueJeans' APIs, here are the steps required to authenticate and enable your Developer Session to place API calls. 1. Choose Method for Authenticating      * Click on the desired Authentication method from below.      * Click on the **Try It Out** button. 1. Make Authentication request      * Follow APIs instructions and input the API parameters.      * Click on the blue **Execute** button.      * If successful, the API returns with JSON data containing a field called **access_token**.  Copy/save this value. 1. Authorize BlueJeans Developer Session.      * Click on the green **Authorize button**.       * The site will show you a pop-up window for authorization.      * Enter your access token in the field named **api_key**      * Click on the **Authorize** button  Your current BlueJeans developer session is now authenticated and ready to place API calls.  The web site will automatically include your access token on any API calls you make. </div> <hr>  <h2 id='oauth' class=\"info\" onclick=\"hideit('oauth')\"><span id=\"oauthicon\" class=\"glyphicon glyphicon-chevron-right\"></span> About onVideo Authentication</h2>  <div id=\"oauthbody\" style=\"display:none\">  All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ### Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform API operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – Authentication for your developer's application occurs through a redirection to a BlueJeans authentication page. The application receives an authorization code to be submitted, along with other tokens, to receive an access token. Known as three-legged OAuth. For more information please refer to the [OAuth specification](https://oauth.net/). ### Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. </div> <hr>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace BlueJeansOnVideoRestApi\Model;

use \ArrayAccess;

/**
 * NumbersNumbers Class Doc Comment
 *
 * @category    Class
 * @package     BlueJeansOnVideoRestApi
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NumbersNumbers implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Numbers_numbers';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'id' => 'int',
        'number' => 'string',
        'tollfree' => 'bool',
        'premium' => 'bool',
        'custom' => 'bool',
        'country' => 'string',
        'country_name' => 'string',
        'state' => 'string',
        'city' => 'string',
        'label' => '\BlueJeansOnVideoRestApi\Model\NumbersLabel',
        'default_settings_inherited' => 'bool',
        'default' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'id' => null,
        'number' => null,
        'tollfree' => null,
        'premium' => null,
        'custom' => null,
        'country' => null,
        'country_name' => null,
        'state' => null,
        'city' => null,
        'label' => null,
        'default_settings_inherited' => null,
        'default' => null
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'number' => 'number',
        'tollfree' => 'tollfree',
        'premium' => 'premium',
        'custom' => 'custom',
        'country' => 'country',
        'country_name' => 'countryName',
        'state' => 'state',
        'city' => 'city',
        'label' => 'label',
        'default_settings_inherited' => 'defaultSettingsInherited',
        'default' => 'default'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'number' => 'setNumber',
        'tollfree' => 'setTollfree',
        'premium' => 'setPremium',
        'custom' => 'setCustom',
        'country' => 'setCountry',
        'country_name' => 'setCountryName',
        'state' => 'setState',
        'city' => 'setCity',
        'label' => 'setLabel',
        'default_settings_inherited' => 'setDefaultSettingsInherited',
        'default' => 'setDefault'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'number' => 'getNumber',
        'tollfree' => 'getTollfree',
        'premium' => 'getPremium',
        'custom' => 'getCustom',
        'country' => 'getCountry',
        'country_name' => 'getCountryName',
        'state' => 'getState',
        'city' => 'getCity',
        'label' => 'getLabel',
        'default_settings_inherited' => 'getDefaultSettingsInherited',
        'default' => 'getDefault'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['number'] = isset($data['number']) ? $data['number'] : null;
        $this->container['tollfree'] = isset($data['tollfree']) ? $data['tollfree'] : null;
        $this->container['premium'] = isset($data['premium']) ? $data['premium'] : null;
        $this->container['custom'] = isset($data['custom']) ? $data['custom'] : null;
        $this->container['country'] = isset($data['country']) ? $data['country'] : null;
        $this->container['country_name'] = isset($data['country_name']) ? $data['country_name'] : null;
        $this->container['state'] = isset($data['state']) ? $data['state'] : null;
        $this->container['city'] = isset($data['city']) ? $data['city'] : null;
        $this->container['label'] = isset($data['label']) ? $data['label'] : null;
        $this->container['default_settings_inherited'] = isset($data['default_settings_inherited']) ? $data['default_settings_inherited'] : null;
        $this->container['default'] = isset($data['default']) ? $data['default'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        return true;
    }


    /**
     * Gets id
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param int $id
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets number
     * @return string
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     * @param string $number
     * @return $this
     */
    public function setNumber($number)
    {
        $this->container['number'] = $number;

        return $this;
    }

    /**
     * Gets tollfree
     * @return bool
     */
    public function getTollfree()
    {
        return $this->container['tollfree'];
    }

    /**
     * Sets tollfree
     * @param bool $tollfree
     * @return $this
     */
    public function setTollfree($tollfree)
    {
        $this->container['tollfree'] = $tollfree;

        return $this;
    }

    /**
     * Gets premium
     * @return bool
     */
    public function getPremium()
    {
        return $this->container['premium'];
    }

    /**
     * Sets premium
     * @param bool $premium
     * @return $this
     */
    public function setPremium($premium)
    {
        $this->container['premium'] = $premium;

        return $this;
    }

    /**
     * Gets custom
     * @return bool
     */
    public function getCustom()
    {
        return $this->container['custom'];
    }

    /**
     * Sets custom
     * @param bool $custom
     * @return $this
     */
    public function setCustom($custom)
    {
        $this->container['custom'] = $custom;

        return $this;
    }

    /**
     * Gets country
     * @return string
     */
    public function getCountry()
    {
        return $this->container['country'];
    }

    /**
     * Sets country
     * @param string $country
     * @return $this
     */
    public function setCountry($country)
    {
        $this->container['country'] = $country;

        return $this;
    }

    /**
     * Gets country_name
     * @return string
     */
    public function getCountryName()
    {
        return $this->container['country_name'];
    }

    /**
     * Sets country_name
     * @param string $country_name
     * @return $this
     */
    public function setCountryName($country_name)
    {
        $this->container['country_name'] = $country_name;

        return $this;
    }

    /**
     * Gets state
     * @return string
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     * @param string $state
     * @return $this
     */
    public function setState($state)
    {
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets city
     * @return string
     */
    public function getCity()
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     * @param string $city
     * @return $this
     */
    public function setCity($city)
    {
        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets label
     * @return \BlueJeansOnVideoRestApi\Model\NumbersLabel
     */
    public function getLabel()
    {
        return $this->container['label'];
    }

    /**
     * Sets label
     * @param \BlueJeansOnVideoRestApi\Model\NumbersLabel $label
     * @return $this
     */
    public function setLabel($label)
    {
        $this->container['label'] = $label;

        return $this;
    }

    /**
     * Gets default_settings_inherited
     * @return bool
     */
    public function getDefaultSettingsInherited()
    {
        return $this->container['default_settings_inherited'];
    }

    /**
     * Sets default_settings_inherited
     * @param bool $default_settings_inherited
     * @return $this
     */
    public function setDefaultSettingsInherited($default_settings_inherited)
    {
        $this->container['default_settings_inherited'] = $default_settings_inherited;

        return $this;
    }

    /**
     * Gets default
     * @return bool
     */
    public function getDefault()
    {
        return $this->container['default'];
    }

    /**
     * Sets default
     * @param bool $default
     * @return $this
     */
    public function setDefault($default)
    {
        $this->container['default'] = $default;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\BlueJeansOnVideoRestApi\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\BlueJeansOnVideoRestApi\ObjectSerializer::sanitizeForSerialization($this));
    }
}


