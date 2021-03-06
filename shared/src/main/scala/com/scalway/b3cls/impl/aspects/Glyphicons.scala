package com.scalway.b3cls.impl.aspects

import com.scalway.b3cls.impl.abst.B3Cls

/**
  * Created by slovic on 29.01.16.
  */
object Glyphicons extends {
    private def icon(name:String) = new B3Cls {
        override val allClassNames: Seq[String] = "glyphicon" :: name :: Nil
    }

    val asterisk = icon("glyphicon-asterisk")
    val plus = icon("glyphicon-plus")
    val minus = icon("glyphicon-minus")
    val euro = icon("glyphicon-euro")
    val cloud = icon("glyphicon-cloud")
    val envelope = icon("glyphicon-envelope")
    val pencil = icon("glyphicon-pencil")
    val glass = icon("glyphicon-glass")
    val music = icon("glyphicon-music")
    val search = icon("glyphicon-search")
    val heart = icon("glyphicon-heart")
    val star = icon("glyphicon-star")
    val starEmpty = icon("glyphicon-star-empty")
    val user = icon("glyphicon-user")
    val film = icon("glyphicon-film")
    val thLarge = icon("glyphicon-th-large")
    val th = icon("glyphicon-th")
    val thList = icon("glyphicon-th-list")
    val ok = icon("glyphicon-ok")
    val remove = icon("glyphicon-remove")
    val zoomIn = icon("glyphicon-zoom-in")
    val zoomOut = icon("glyphicon-zoom-out")
    val off = icon("glyphicon-off")
    val signal = icon("glyphicon-signal")
    val cog = icon("glyphicon-cog")
    val trash = icon("glyphicon-trash")
    val home = icon("glyphicon-home")
    val file = icon("glyphicon-file")
    val time = icon("glyphicon-time")
    val road = icon("glyphicon-road")
    val downloadAlt = icon("glyphicon-download-alt")
    val download = icon("glyphicon-download")
    val upload = icon("glyphicon-upload")
    val inbox = icon("glyphicon-inbox")
    val playCircle = icon("glyphicon-play-circle")
    val repeat = icon("glyphicon-repeat")
    val refresh = icon("glyphicon-refresh")
    val listAlt = icon("glyphicon-list-alt")
    val lock = icon("glyphicon-lock")
    val flag = icon("glyphicon-flag")
    val headphones = icon("glyphicon-headphones")
    val volumeOff = icon("glyphicon-volume-off")
    val volumeDown = icon("glyphicon-volume-down")
    val volumeUp = icon("glyphicon-volume-up")
    val qrcode = icon("glyphicon-qrcode")
    val barcode = icon("glyphicon-barcode")
    val tag = icon("glyphicon-tag")
    val tags = icon("glyphicon-tags")
    val book = icon("glyphicon-book")
    val bookmark = icon("glyphicon-bookmark")
    val print = icon("glyphicon-print")
    val camera = icon("glyphicon-camera")
    val font = icon("glyphicon-font")
    val bold = icon("glyphicon-bold")
    val italic = icon("glyphicon-italic")
    val textHeight = icon("glyphicon-text-height")
    val textWidth = icon("glyphicon-text-width")
    val alignLeft = icon("glyphicon-align-left")
    val alignCenter = icon("glyphicon-align-center")
    val alignRight = icon("glyphicon-align-right")
    val alignJustify = icon("glyphicon-align-justify")
    val list = icon("glyphicon-list")
    val indentLeft = icon("glyphicon-indent-left")
    val indentRight = icon("glyphicon-indent-right")
    val facetimeVideo = icon("glyphicon-facetime-video")
    val picture = icon("glyphicon-picture")
    val mapMarker = icon("glyphicon-map-marker")
    val adjust = icon("glyphicon-adjust")
    val tint = icon("glyphicon-tint")
    val edit = icon("glyphicon-edit")
    val share = icon("glyphicon-share")
    val check = icon("glyphicon-check")
    val move = icon("glyphicon-move")
    val stepBackward = icon("glyphicon-step-backward")
    val fastBackward = icon("glyphicon-fast-backward")
    val backward = icon("glyphicon-backward")
    val play = icon("glyphicon-play")
    val pause = icon("glyphicon-pause")
    val stop = icon("glyphicon-stop")
    val forward = icon("glyphicon-forward")
    val fastForward = icon("glyphicon-fast-forward")
    val stepForward = icon("glyphicon-step-forward")
    val eject = icon("glyphicon-eject")
    val chevronLeft = icon("glyphicon-chevron-left")
    val chevronRight = icon("glyphicon-chevron-right")
    val plusSign = icon("glyphicon-plus-sign")
    val minusSign = icon("glyphicon-minus-sign")
    val removeSign = icon("glyphicon-remove-sign")
    val okSign = icon("glyphicon-ok-sign")
    val questionSign = icon("glyphicon-question-sign")
    val infoSign = icon("glyphicon-info-sign")
    val screenshot = icon("glyphicon-screenshot")
    val removeCircle = icon("glyphicon-remove-circle")
    val okCircle = icon("glyphicon-ok-circle")
    val banCircle = icon("glyphicon-ban-circle")
    val arrowLeft = icon("glyphicon-arrow-left")
    val arrowRight = icon("glyphicon-arrow-right")
    val arrowUp = icon("glyphicon-arrow-up")
    val arrowDown = icon("glyphicon-arrow-down")
    val shareAlt = icon("glyphicon-share-alt")
    val resizeFull = icon("glyphicon-resize-full")
    val resizeSmall = icon("glyphicon-resize-small")
    val exclamationSign = icon("glyphicon-exclamation-sign")
    val gift = icon("glyphicon-gift")
    val leaf = icon("glyphicon-leaf")
    val fire = icon("glyphicon-fire")
    val eyeOpen = icon("glyphicon-eye-open")
    val eyeClose = icon("glyphicon-eye-close")
    val warningSign = icon("glyphicon-warning-sign")
    val plane = icon("glyphicon-plane")
    val calendar = icon("glyphicon-calendar")
    val random = icon("glyphicon-random")
    val comment = icon("glyphicon-comment")
    val magnet = icon("glyphicon-magnet")
    val chevronUp = icon("glyphicon-chevron-up")
    val chevronDown = icon("glyphicon-chevron-down")
    val retweet = icon("glyphicon-retweet")
    val shoppingCart = icon("glyphicon-shopping-cart")
    val folderClose = icon("glyphicon-folder-close")
    val folderOpen = icon("glyphicon-folder-open")
    val resizeVertical = icon("glyphicon-resize-vertical")
    val resizeHorizontal = icon("glyphicon-resize-horizontal")
    val hdd = icon("glyphicon-hdd")
    val bullhorn = icon("glyphicon-bullhorn")
    val bell = icon("glyphicon-bell")
    val certificate = icon("glyphicon-certificate")
    val thumbsUp = icon("glyphicon-thumbs-up")
    val thumbsDown = icon("glyphicon-thumbs-down")
    val handRight = icon("glyphicon-hand-right")
    val handLeft = icon("glyphicon-hand-left")
    val handUp = icon("glyphicon-hand-up")
    val handDown = icon("glyphicon-hand-down")
    val circleArrowRight = icon("glyphicon-circle-arrow-right")
    val circleArrowLeft = icon("glyphicon-circle-arrow-left")
    val circleArrowUp = icon("glyphicon-circle-arrow-up")
    val circleArrowDown = icon("glyphicon-circle-arrow-down")
    val globe = icon("glyphicon-globe")
    val wrench = icon("glyphicon-wrench")
    val tasks = icon("glyphicon-tasks")
    val filter = icon("glyphicon-filter")
    val briefcase = icon("glyphicon-briefcase")
    val fullscreen = icon("glyphicon-fullscreen")
    val dashboard = icon("glyphicon-dashboard")
    val paperclip = icon("glyphicon-paperclip")
    val heartEmpty = icon("glyphicon-heart-empty")
    val link = icon("glyphicon-link")
    val phone = icon("glyphicon-phone")
    val pushpin = icon("glyphicon-pushpin")
    val usd = icon("glyphicon-usd")
    val gbp = icon("glyphicon-gbp")
    val sort = icon("glyphicon-sort")
    val sortByAlphabet = icon("glyphicon-sort-by-alphabet")
    val sortByAlphabetAlt = icon("glyphicon-sort-by-alphabet-alt")
    val sortByOrder = icon("glyphicon-sort-by-order")
    val sortByOrderAlt = icon("glyphicon-sort-by-order-alt")
    val sortByAttributes = icon("glyphicon-sort-by-attributes")
    val sortByAttributesAlt = icon("glyphicon-sort-by-attributes-alt")
    val unchecked = icon("glyphicon-unchecked")
    val expand = icon("glyphicon-expand")
    val collapseDown = icon("glyphicon-collapse-down")
    val collapseUp = icon("glyphicon-collapse-up")
    val logIn = icon("glyphicon-log-in")
    val flash = icon("glyphicon-flash")
    val logOut = icon("glyphicon-log-out")
    val newWindow = icon("glyphicon-new-window")
    val record = icon("glyphicon-record")
    val save = icon("glyphicon-save")
    val open = icon("glyphicon-open")
    val saved = icon("glyphicon-saved")
    val import_ = icon("glyphicon-import")
    val export = icon("glyphicon-export")
    val send = icon("glyphicon-send")
    val floppyDisk = icon("glyphicon-floppy-disk")
    val floppySaved = icon("glyphicon-floppy-saved")
    val floppyRemove = icon("glyphicon-floppy-remove")
    val floppySave = icon("glyphicon-floppy-save")
    val floppyOpen = icon("glyphicon-floppy-open")
    val creditCard = icon("glyphicon-credit-card")
    val transfer = icon("glyphicon-transfer")
    val cutlery = icon("glyphicon-cutlery")
    val header = icon("glyphicon-header")
    val compressed = icon("glyphicon-compressed")
    val earphone = icon("glyphicon-earphone")
    val phoneAlt = icon("glyphicon-phone-alt")
    val tower = icon("glyphicon-tower")
    val stats = icon("glyphicon-stats")
    val sdVideo = icon("glyphicon-sd-video")
    val hdVideo = icon("glyphicon-hd-video")
    val subtitles = icon("glyphicon-subtitles")
    val soundStereo = icon("glyphicon-sound-stereo")
    val soundDolby = icon("glyphicon-sound-dolby")
    val sound5_1 = icon("glyphicon-sound-5-1")
    val sound6_1 = icon("glyphicon-sound-6-1")
    val sound7_1 = icon("glyphicon-sound-7-1")
    val copyrightMark = icon("glyphicon-copyright-mark")
    val registrationMark = icon("glyphicon-registration-mark")
    val cloudDownload = icon("glyphicon-cloud-download")
    val cloudUpload = icon("glyphicon-cloud-upload")
    val treeConifer = icon("glyphicon-tree-conifer")
    val treeDeciduous = icon("glyphicon-tree-deciduous")
    val cd = icon("glyphicon-cd")
    val saveFile = icon("glyphicon-save-file")
    val openFile = icon("glyphicon-open-file")
    val levelUp = icon("glyphicon-level-up")
    val copy = icon("glyphicon-copy")
    val paste = icon("glyphicon-paste")
    val alert = icon("glyphicon-alert")
    val equalizer = icon("glyphicon-equalizer")
    val king = icon("glyphicon-king")
    val queen = icon("glyphicon-queen")
    val pawn = icon("glyphicon-pawn")
    val bishop = icon("glyphicon-bishop")
    val knight = icon("glyphicon-knight")
    val babyFormula = icon("glyphicon-baby-formula")
    val tent = icon("glyphicon-tent")
    val blackboard = icon("glyphicon-blackboard")
    val bed = icon("glyphicon-bed")
    val apple = icon("glyphicon-apple")
    val erase = icon("glyphicon-erase")
    val hourglass = icon("glyphicon-hourglass")
    val lamp = icon("glyphicon-lamp")
    val duplicate = icon("glyphicon-duplicate")
    val piggyBank = icon("glyphicon-piggy-bank")
    val scissors = icon("glyphicon-scissors")
    val bitcoin = icon("glyphicon-bitcoin")
    val yen = icon("glyphicon-yen")
    val ruble = icon("glyphicon-ruble")
    val scale = icon("glyphicon-scale")
    val iceLolly = icon("glyphicon-ice-lolly")
    val iceLollyTasted = icon("glyphicon-ice-lolly-tasted")
    val education = icon("glyphicon-education")
    val optionHorizontal = icon("glyphicon-option-horizontal")
    val optionVertical = icon("glyphicon-option-vertical")
    val menuHamburger = icon("glyphicon-menu-hamburger")
    val modalWindow = icon("glyphicon-modal-window")
    val oil = icon("glyphicon-oil")
    val grain = icon("glyphicon-grain")
    val sunglasses = icon("glyphicon-sunglasses")
    val textSize = icon("glyphicon-text-size")
    val textColor = icon("glyphicon-text-color")
    val textBackground = icon("glyphicon-text-background")
    val objectAlignTop = icon("glyphicon-object-align-top")
    val objectAlignBottom = icon("glyphicon-object-align-bottom")
    val objectAlignHorizontal = icon("glyphicon-object-align-horizontal")
    val objectAlignLeft = icon("glyphicon-object-align-left")
    val objectAlignVertical = icon("glyphicon-object-align-vertical")
    val objectAlignRight = icon("glyphicon-object-align-right")
    val triangleRight = icon("glyphicon-triangle-right")
    val triangleLeft = icon("glyphicon-triangle-left")
    val triangleBottom = icon("glyphicon-triangle-bottom")
    val triangleTop = icon("glyphicon-triangle-top")
    val superscript = icon("glyphicon-superscript")
    val subscript = icon("glyphicon-subscript")
    val menuLeft = icon("glyphicon-menu-left")
    val menuRight = icon("glyphicon-menu-right")
    val menuDown = icon("glyphicon-menu-down")
    val menuUp = icon("glyphicon-menu-up")
}
