package ilapin.common.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author Игорь on 20.11.2019.
 */
open class ObserverWrapper<T> : Observer<T> {

    private var _disposable: Disposable? = null

    val disposable: Disposable?
        get() = _disposable

    override fun onComplete() {} // do nothing

    override fun onSubscribe(d: Disposable) {
        _disposable = d
    }

    override fun onNext(t: T) {} // do nothing

    override fun onError(e: Throwable) {} // do nothing
}