<template>

    <v-card outlined>
        <v-card-title>
            ShareVideo
        </v-card-title>

        <v-card-text>
            <string offline label="VideoId" v-model="value.videoId" :editMode="editMode" @change="change"/>
            <string offline label="VideoAccess" v-model="value.videoAccess" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="shareVideo"
            >
                ShareVideo
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ShareVideoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.videoId = {};
            this.value.videoAccess = {};
        },
        watch: {
        },
        methods: {
            shareVideo() {
                this.$emit('shareVideo', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

