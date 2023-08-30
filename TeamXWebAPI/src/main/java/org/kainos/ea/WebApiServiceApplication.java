package org.kainos.ea;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class WebApiServiceApplication extends Application<WebApiServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new WebApiServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "WebApiService";
    }

    @Override
    public void initialize(final Bootstrap<WebApiServiceConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<WebApiServiceConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(WebApiServiceConfiguration configuration) {
                return configuration.getSwagger();
            }
        });
    }

    @Override
    public void run(final WebApiServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
