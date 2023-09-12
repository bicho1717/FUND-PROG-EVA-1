<?xml version="1.0"?>
<flowgorithm fileversion="3.0">
    <attributes>
        <attribute name="name" value=""/>
        <attribute name="authors" value="invitado"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2023-09-12 05:50:53 p. m."/>
        <attribute name="created" value="aW52aXRhZG87TEFCMDIwNDIzOzIwMjMtMDktMTI7MDQ6NTk6MzggcC4gbS47Mjg0OA=="/>
        <attribute name="edited" value="aW52aXRhZG87TEFCMDIwNDIzOzIwMjMtMDktMTI7MDU6NTA6NTMgcC4gbS47MTsyOTQ1"/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="area" type="Real" array="False" size=""/>
            <declare name="base" type="Real" array="False" size=""/>
            <declare name="altura" type="Real" array="False" size=""/>
            <output expression="&quot;Introduce la altura&quot;" newline="True"/>
            <input variable="altura"/>
            <output expression="&quot;Introduce la base&quot;" newline="True"/>
            <input variable="base"/>
            <assign variable="area" expression="(base * altura) / 2"/>
            <output expression="&quot;El Area es&quot;" newline="True"/>
            <output expression="area" newline="True"/>
        </body>
    </function>
</flowgorithm>
