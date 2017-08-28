package com.moez.QKSMS.ui.conversations

import android.arch.lifecycle.ViewModel
import com.moez.QKSMS.data.repository.ConversationRepository

class ConversationListViewModel : ViewModel() {

    private val repository = ConversationRepository()

    var conversations = repository.getConversations()

}