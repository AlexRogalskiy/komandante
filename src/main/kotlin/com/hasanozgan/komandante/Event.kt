package com.hasanozgan.komandante

import java.time.ZonedDateTime

typealias EventData = String
typealias EventType = String

abstract class Event() {
    var timestamp = ZonedDateTime.now()
    open var version: Int = 0
    abstract val aggregateID: AggregateID
}

typealias EventList = List<Event>