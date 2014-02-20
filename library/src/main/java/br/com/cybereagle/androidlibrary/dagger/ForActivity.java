package br.com.cybereagle.androidlibrary.dagger;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Documented
@Retention(RUNTIME)
@Inherited
public @interface ForActivity {
}
