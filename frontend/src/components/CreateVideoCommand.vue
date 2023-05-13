<template>

    <v-card outlined>
        <v-card-title>
            CreateVideo
        </v-card-title>

        <v-card-text>
            <string offline label="VideoName" v-model="value.videoName" :editMode="editMode" @change="change"/>
            <string offline label="VideoType" v-model="value.videoType" :editMode="editMode" @change="change"/>
            <int offline label="VideoSize" v-model="value.videoSize" :editMode="editMode" @change="change"/>
            <string offline label="VideoPath" v-model="value.videoPath" :editMode="editMode" @change="change"/>
            <string offline label="VideoOwner" v-model="value.videoOwner" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createVideo"
            >
                CreateVideo
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
        name: 'CreateVideoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.videoName = {};
            this.value.videoType = {};
            this.value.videoSize = {};
            this.value.videoPath = {};
            this.value.videoOwner = {};
        },
        watch: {
        },
        methods: {
            createVideo() {
                this.$emit('createVideo', this.value);
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

