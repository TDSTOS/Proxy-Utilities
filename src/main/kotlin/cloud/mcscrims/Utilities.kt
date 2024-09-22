package cloud.mcscrims;

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import org.slf4j.Logger

@Plugin(
    id = "proxy-utilities", name = "Proxy-Utilities", version = BuildConstants.VERSION
)
class Utilities @Inject constructor(val logger: Logger) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
    }
}
