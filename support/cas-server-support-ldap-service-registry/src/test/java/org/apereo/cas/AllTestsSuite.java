
package org.apereo.cas;

import org.apereo.cas.adaptors.ldap.services.LdapContinuousIntegrationServiceRegistryTests;
import org.apereo.cas.adaptors.ldap.services.LdapServiceRegistryTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    LdapServiceRegistryTests.class,
    LdapContinuousIntegrationServiceRegistryTests.class
})
public class AllTestsSuite {
}
