<template>

    <v-card outlined>
        <v-card-title>
            ShareDocument
        </v-card-title>

        <v-card-text>
            <string offline label="DocumentId" v-model="value.documentId" :editMode="editMode" @change="change"/>
            <string offline label="DocumentAccess" v-model="value.documentAccess" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="shareDocument"
            >
                ShareDocument
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
        name: 'ShareDocumentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.documentId = {};
            this.value.documentAccess = {};
        },
        watch: {
        },
        methods: {
            shareDocument() {
                this.$emit('shareDocument', this.value);
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

