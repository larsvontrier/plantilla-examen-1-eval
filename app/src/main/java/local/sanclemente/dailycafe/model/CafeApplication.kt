package local.sanclemente.dailycafe.model

import android.app.Application
import local.sanclemente.dailycafe.db.CafeRepository

class CafeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        CafeRepository.initialize(this)
    }
}