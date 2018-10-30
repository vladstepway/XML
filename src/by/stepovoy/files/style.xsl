<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="office">
        <html>
            <body>
                <xsl:for-each select="category">
                    <p>
                        <xsl:value-of select="@name"/>
                    </p>

                    <table border="1">
                        <tr>
                            <th>ID</th>
                            <th>Type</th>
                            <th>Company</th>
                            <th>Country</th>
                            <th>Purpose</th>
                            <th>Cost</th>
                            <th>Currency</th>
                        </tr>
                        <xsl:for-each select="product">

                            <tr>
                                <td>
                                    <p>
                                        <xsl:value-of select="@id"/>
                                    </p>
                                </td>
                                <p>
                                    <td>
                                        <xsl:value-of select="type"/>
                                    </td>
                                </p>

                                <p>
                                    <td>
                                        <xsl:value-of select="company"/>
                                    </td>
                                </p>
                                <p>
                                    <td>
                                        <xsl:value-of select="country"/>
                                    </td>
                                </p>
                                <p>
                                    <td>
                                        <xsl:value-of select="purpose"/>
                                    </td>
                                </p>
                                <p>
                                    <td>
                                        <xsl:value-of select="cost"/>
                                    </td>
                                </p>
                                <p>
                                    <td>
                                        <xsl:value-of select="cost/@currency"/>
                                    </td>
                                </p>
                            </tr>

                        </xsl:for-each>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>


</xsl:stylesheet>