<template>

    <v-card outlined>
        <v-card-title>
            DeleteVideo
        </v-card-title>

        <v-card-text>
            <string offline label="VideoId" v-model="value.videoId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="deleteVideo"
            >
                DeleteVideo
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
        name: 'DeleteVideoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.videoId = {};
        },
        watch: {
        },
        methods: {
            deleteVideo() {
                this.$emit('deleteVideo', this.value);
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

