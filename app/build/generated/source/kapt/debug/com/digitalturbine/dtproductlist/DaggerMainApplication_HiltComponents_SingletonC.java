package com.digitalturbine.dtproductlist;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.digitalturbine.dtproductlist.api.Repository;
import com.digitalturbine.dtproductlist.api.Repository_Factory;
import com.digitalturbine.dtproductlist.api.Repository_MembersInjector;
import com.digitalturbine.dtproductlist.db.MainDatabase;
import com.digitalturbine.dtproductlist.di.WebAPI;
import com.digitalturbine.dtproductlist.di.modules.DatabaseModule;
import com.digitalturbine.dtproductlist.di.modules.DatabaseModule_ProvideDatabaseFactory;
import com.digitalturbine.dtproductlist.di.modules.WebModule_ProvideRetrofitClientFactory;
import com.digitalturbine.dtproductlist.di.modules.WebModule_ProvideWebAPIFactory;
import com.digitalturbine.dtproductlist.ui.AdDetailsFragment;
import com.digitalturbine.dtproductlist.ui.AdDetailsFragment_MembersInjector;
import com.digitalturbine.dtproductlist.ui.AdDetailsViewModel;
import com.digitalturbine.dtproductlist.ui.AdDetailsViewModel_Factory;
import com.digitalturbine.dtproductlist.ui.AdDetailsViewModel_MembersInjector;
import com.digitalturbine.dtproductlist.ui.AdListFragment;
import com.digitalturbine.dtproductlist.ui.AdListFragment_MembersInjector;
import com.digitalturbine.dtproductlist.ui.AdListViewModel;
import com.digitalturbine.dtproductlist.ui.AdListViewModel_Factory;
import com.digitalturbine.dtproductlist.ui.AdListViewModel_MembersInjector;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private MainDatabase mainDatabase() {
    return DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private volatile Retrofit retrofit;

        private volatile WebAPI webAPI;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private Retrofit retrofit() {
          Object local = retrofit;
          if (local == null) {
            local = WebModule_ProvideRetrofitClientFactory.provideRetrofitClient();
            retrofit = (Retrofit) local;
          }
          return (Retrofit) local;
        }

        private WebAPI webAPI() {
          Object local = webAPI;
          if (local == null) {
            local = WebModule_ProvideWebAPIFactory.provideWebAPI(retrofit());
            webAPI = (WebAPI) local;
          }
          return (WebAPI) local;
        }

        private Repository repository() {
          return injectRepository(Repository_Factory.newInstance());
        }

        private AdDetailsViewModel adDetailsViewModel() {
          return injectAdDetailsViewModel(AdDetailsViewModel_Factory.newInstance());
        }

        private AdListViewModel adListViewModel() {
          return injectAdListViewModel(AdListViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule)));
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());
        }

        @Override
        public void injectAdDetailsFragment(AdDetailsFragment adDetailsFragment) {
          injectAdDetailsFragment2(adDetailsFragment);
        }

        @Override
        public void injectAdListFragment(AdListFragment adListFragment) {
          injectAdListFragment2(adListFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private Repository injectRepository(Repository instance) {
          Repository_MembersInjector.injectWebAPI(instance, webAPI());
          Repository_MembersInjector.injectMainDatabase(instance, DaggerMainApplication_HiltComponents_SingletonC.this.mainDatabase());
          return instance;
        }

        private AdDetailsViewModel injectAdDetailsViewModel(AdDetailsViewModel instance) {
          AdDetailsViewModel_MembersInjector.injectRepository(instance, repository());
          return instance;
        }

        private AdDetailsFragment injectAdDetailsFragment2(AdDetailsFragment instance) {
          AdDetailsFragment_MembersInjector.injectViewModel(instance, adDetailsViewModel());
          return instance;
        }

        private AdListViewModel injectAdListViewModel(AdListViewModel instance) {
          AdListViewModel_MembersInjector.injectRepository(instance, repository());
          return instance;
        }

        private AdListFragment injectAdListFragment2(AdListFragment instance) {
          AdListFragment_MembersInjector.injectViewModel(instance, adListViewModel());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
