/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "CppRestPetstoreClient/HttpContent.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

HttpContent::HttpContent()
{
}

HttpContent::~HttpContent()
{
}

utility::string_t HttpContent::getContentDisposition() const
{
    return m_ContentDisposition;
}

void HttpContent::setContentDisposition( const utility::string_t & value )
{
    m_ContentDisposition = value;
}

utility::string_t HttpContent::getName() const
{
    return m_Name;
}

void HttpContent::setName( const utility::string_t & value )
{
    m_Name = value;
}

utility::string_t HttpContent::getFileName() const
{
    return m_FileName;
}

void HttpContent::setFileName( const utility::string_t & value )
{
    m_FileName = value;
}

utility::string_t HttpContent::getContentType() const
{
    return m_ContentType;
}

void HttpContent::setContentType( const utility::string_t & value )
{
    m_ContentType = value;
}

std::shared_ptr<std::istream> HttpContent::getData() const
{
    return m_Data;
}

void HttpContent::setData( std::shared_ptr<std::istream> value )
{
    m_Data = value;
}

void HttpContent::writeTo( std::ostream& stream )
{
    m_Data->seekg( 0, m_Data->beg );
    stream << m_Data->rdbuf();
}

}
}
}
}
