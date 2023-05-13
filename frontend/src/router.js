
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import DocumentManager from "./components/listers/DocumentCards"
import DocumentDetail from "./components/listers/DocumentDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"

import UserManager from "./components/listers/UserCards"
import UserDetail from "./components/listers/UserDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/documents',
                name: 'DocumentManager',
                component: DocumentManager
            },
            {
                path: '/documents/:id',
                name: 'DocumentDetail',
                component: DocumentDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },

            {
                path: '/users',
                name: 'UserManager',
                component: UserManager
            },
            {
                path: '/users/:id',
                name: 'UserDetail',
                component: UserDetail
            },



    ]
})
