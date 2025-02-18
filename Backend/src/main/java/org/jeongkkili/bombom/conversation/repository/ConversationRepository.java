package org.jeongkkili.bombom.conversation.repository;

import org.jeongkkili.bombom.conversation.domain.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
