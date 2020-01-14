package ilapin.common.kotlin

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * @author Игорь on 14.01.2020.
 */
operator fun CompositeDisposable.plusAssign(disposable: Disposable) {
    add(disposable)
}
