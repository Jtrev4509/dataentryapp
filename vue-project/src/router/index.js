import Vue from 'vue'
import Router from 'vue-router'
import DataEntry from '../components/DataEntry.vue'
import ConfirmationPage from '../components/ConfirmationPage.vue'

Vue.use(Router)

const router = new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: "/",
            name: 'home',
            component: DataEntry
        },
        {
            path: "/usersList",
            name: "usersList",
            component: ConfirmationPage,
            props: true
        }]
    })

    export default router;